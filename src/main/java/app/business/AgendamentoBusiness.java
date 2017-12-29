package app.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import app.dao.AgendamentoDAO;
import app.entity.Agendamento;
import app.entity.AgendamentoDTO;
import app.entity.AgendamentoServico;
import app.entity.Servico;

/**
 * Classe que representa a camada de negócios de AgendamentoBusiness
 * 
 * @generated
 **/
@Service("AgendamentoBusiness")
public class AgendamentoBusiness {

  @Autowired
  @Qualifier("AgendamentoDAO")
  protected AgendamentoDAO repository;
  
  @Autowired
  @Qualifier("AgendamentoServicoBusiness")
  protected AgendamentoServicoBusiness agendaServBuss;

  public Agendamento post(final Agendamento entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Agendamento result = repository.save(entity);
    
    List<AgendamentoServico> listaS = agendaServBuss.findAgendamentoServicosByAgendamento(result.getId(), null).getContent();
    double total = 0.0;
    for (AgendamentoServico j : listaS)
    {
      total += j.getServico().getValorServico();
    }
    result.setValorTotal(total);  
    
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Agendamento put(final Agendamento entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Agendamento result = repository.saveAndFlush(entity);
    
    List<AgendamentoServico> listaS = agendaServBuss.findAgendamentoServicosByAgendamento(result.getId(), null).getContent();
    double total = 0.0;
    for (AgendamentoServico j : listaS)
    {
      total += j.getServico().getValorServico();
    }
    result.setValorTotal(total);  
    
    
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public void delete(java.lang.String id) throws Exception {
    Agendamento entity = this.get(id);
    // begin-user-code  
    // end-user-code
    this.repository.delete(entity);
    // begin-user-code  
    // end-user-code        
  }
  
  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public Agendamento get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Agendamento result = repository.findOne(id);
    // begin-user-code
    // end-user-code
    return result;
  }

  // CRUD
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<Agendamento> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Agendamento> result = repository.list(pageable);
    for (Agendamento i : result.getContent())
    {
      List<AgendamentoServico> listaS = agendaServBuss.findAgendamentoServicosByAgendamento(i.getId(), pageable).getContent();
      double total = 0.0;
      for (AgendamentoServico j : listaS)
      {
        total += j.getServico().getValorServico();
      }
      i.setValorTotal(total);  
    }
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<Agendamento> listByCliente( java.lang.String clienteId, Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Agendamento> result = repository.listByCliente( clienteId, pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<Agendamento> listByFuncionario( java.lang.String funcionarioId, Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Agendamento> result = repository.listByFuncionario( funcionarioId, pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<Agendamento> listByData( java.util.Date data, Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Agendamento> result = repository.listByData( data, pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<AgendamentoServico> findAgendamentoServico(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<AgendamentoServico> result = repository.findAgendamentoServico(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  /**
   * @generated modifiable
   * ManyToMany Relation
   */  
  public Page<Servico> listServico(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Servico> result = repository.listServico(id, pageable);
    // begin-user-code
    // end-user-code
    return result;            
  }
  
  /**
   * @generated modifiable
   * ManyToMany Relation
   */    
  public int deleteServico(java.lang.String instanceId, java.lang.String relationId) {
    // begin-user-code
    // end-user-code  
    int result = repository.deleteServico(instanceId, relationId);
    // begin-user-code
    // end-user-code  
    return result;  
  }
  /**
   * Foreign Key cliente
   * @generated
   */
  public List<AgendamentoDTO> findAgendamentosByCliente(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Agendamento> result = repository.findAgendamentosByCliente(instanceId, pageable);
    List<AgendamentoDTO> res = new ArrayList<AgendamentoDTO>();
    for (Agendamento i : result.getContent())
    {
      AgendamentoDTO dto = new AgendamentoDTO();
      dto.setValorTotal(i.getValorTotal());
      dto.setId(i.getId());
      dto.setHora(i.getHora());
      dto.setFuncionario(i.getFuncionario());
      dto.setData(i.getData());
      dto.setCliente(i.getCliente());
      List<AgendamentoServico> listaS = agendaServBuss.findAgendamentoServicosByAgendamento(i.getId(), pageable).getContent();
      double total = 0.0;
      for (AgendamentoServico j : listaS)
      {
        total += j.getServico().getValorServico();
      }
      dto.setServicos(listaS);
      dto.setValorTotal(total);
      res.add(dto);
    }
    
    // begin-user-code
    // end-user-code
    return res;
  }
  
  /**
   * Foreign Key funcionario
   * @generated
   */
  public List<AgendamentoDTO> findAgendamentosByFuncionario(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Agendamento> result = repository.findAgendamentosByFuncionario(instanceId, pageable);
    List<AgendamentoDTO> res = new ArrayList<AgendamentoDTO>();
    for (Agendamento i : result.getContent())
    {
      AgendamentoDTO dto = new AgendamentoDTO();
      dto.setValorTotal(i.getValorTotal());
      dto.setId(i.getId());
      dto.setHora(i.getHora());
      dto.setFuncionario(i.getFuncionario());
      dto.setData(i.getData());
      dto.setCliente(i.getCliente());
      List<AgendamentoServico> listaS = agendaServBuss.findAgendamentoServicosByAgendamento(i.getId(), pageable).getContent();
      double total = 0.0;
      for (AgendamentoServico j : listaS)
      {
        total += j.getServico().getValorServico();
      }
      dto.setServicos(listaS);
      dto.setValorTotal(total);
      
      res.add(dto);
    }
    
    // begin-user-code
    // end-user-code
    return res;
  }
  
  public List<AgendamentoDTO> listByDataFutura(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Agendamento> result = repository.listByDataFutura(pageable);
    List<AgendamentoDTO> res = new ArrayList<AgendamentoDTO>();
    for (Agendamento i : result.getContent())
    {
      AgendamentoDTO dto = new AgendamentoDTO();
      dto.setValorTotal(i.getValorTotal());
      dto.setId(i.getId());
      dto.setHora(i.getHora());
      dto.setFuncionario(i.getFuncionario());
      dto.setData(i.getData());
      dto.setCliente(i.getCliente());
      List<AgendamentoServico> listaS = agendaServBuss.findAgendamentoServicosByAgendamento(i.getId(), pageable).getContent();
      double total = 0.0;
      for (AgendamentoServico j : listaS)
      {
        total += j.getServico().getValorServico();
      }
      dto.setServicos(listaS);
      dto.setValorTotal(total);
      res.add(dto);
    }
    
    // begin-user-code
    // end-user-code
    return res;
  }
  
}
