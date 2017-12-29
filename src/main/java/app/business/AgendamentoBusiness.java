package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;
import app.dao.*;
import app.entity.*;

/**
 * Classe que representa a camada de negócios de AgendamentoBusiness
 * 
 * @generated
 **/
@Service("AgendamentoBusiness")
public class AgendamentoBusiness {



  /**
   * Instância da classe AgendamentoDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("AgendamentoDAO")
  protected AgendamentoDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Agendamento post(final Agendamento entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Agendamento result = repository.save(entity);
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
  
  public Page<Agendamento> listByDataFutura(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Agendamento> result = repository.listByDataFutura(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * Foreign Key servico
   * @generated
   */
  public Page<Agendamento> findAgendamentosByServico(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Agendamento> result = repository.findAgendamentosByServico(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
  /**
   * Foreign Key cliente
   * @generated
   */
  public Page<Agendamento> findAgendamentosByCliente(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Agendamento> result = repository.findAgendamentosByCliente(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
  /**
   * Foreign Key funcionario
   * @generated
   */
  public Page<Agendamento> findAgendamentosByFuncionario(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Agendamento> result = repository.findAgendamentosByFuncionario(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
