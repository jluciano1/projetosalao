package app.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import app.entity.*;
import app.business.*;

/**
 * Controller para expor serviços REST de Agendamento
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Agendamento")
public class AgendamentoREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("AgendamentoBusiness")
  private AgendamentoBusiness agendamentoBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("ServicoBusiness")
  private ServicoBusiness servicoBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("AgendamentoServicoBusiness")
  private AgendamentoServicoBusiness agendamentoServicoBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Agendamento post(@Validated @RequestBody final Agendamento entity) throws Exception {
    return agendamentoBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Agendamento put(@Validated @RequestBody final Agendamento entity) throws Exception {
    return agendamentoBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{agendamentoId}")
  public Agendamento put(@Validated @RequestBody final Agendamento entity, @PathVariable("agendamentoId") java.lang.String agendamentoId) throws Exception {
    return agendamentoBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{agendamentoId}")
  public void delete(@PathVariable("agendamentoId") java.lang.String agendamentoId) throws Exception {
    agendamentoBusiness.delete(agendamentoId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Agendamento>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(agendamentoBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * NamedQuery listByCliente
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/listByCliente/{clienteId}")
  public HttpEntity<PagedResources<Agendamento>> listByClienteParams(@PathVariable("clienteId") java.lang.String clienteId, Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(agendamentoBusiness.listByCliente(clienteId, pageable)), HttpStatus.OK);    
  }

  /**
   * NamedQuery listByFuncionario
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/listByFuncionario/{funcionarioId}")
  public HttpEntity<PagedResources<Agendamento>> listByFuncionarioParams(@PathVariable("funcionarioId") java.lang.String funcionarioId, Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(agendamentoBusiness.listByFuncionario(funcionarioId, pageable)), HttpStatus.OK);    
  }

  /**
   * NamedQuery listByData
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/listByData/{data}")
  public HttpEntity<PagedResources<Agendamento>> listByDataParams(@PathVariable("data") java.util.Date data, Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(agendamentoBusiness.listByData(data, pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{agendamentoId}/AgendamentoServico")    
  public HttpEntity<PagedResources<AgendamentoServico>> findAgendamentoServico(@PathVariable("agendamentoId") java.lang.String agendamentoId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(agendamentoBusiness.findAgendamentoServico(agendamentoId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{agendamentoId}/AgendamentoServico/{agendamentoServicoId}")    
  public void deleteAgendamentoServico(@PathVariable("agendamentoServicoId") java.lang.String agendamentoServicoId) throws Exception {
    this.agendamentoServicoBusiness.delete(agendamentoServicoId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{agendamentoId}/AgendamentoServico")
  public AgendamentoServico putAgendamentoServico(@Validated @RequestBody final AgendamentoServico entity, @PathVariable("agendamentoId") java.lang.String agendamentoId) throws Exception {
    return this.agendamentoServicoBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{agendamentoId}/AgendamentoServico")
  public AgendamentoServico postAgendamentoServico(@Validated @RequestBody final AgendamentoServico entity, @PathVariable("agendamentoId") java.lang.String agendamentoId) throws Exception {
    Agendamento agendamento = this.agendamentoBusiness.get(agendamentoId);
    entity.setAgendamento(agendamento);
    return this.agendamentoServicoBusiness.post(entity);
  }

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{agendamentoId}/Servico")
  public HttpEntity<PagedResources<Servico>> listServico(@PathVariable("agendamentoId") java.lang.String agendamentoId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(agendamentoBusiness.listServico(agendamentoId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{agendamentoId}/Servico")
  public Agendamento postServico(@Validated @RequestBody final Servico entity, @PathVariable("agendamentoId") java.lang.String agendamentoId) throws Exception {
    AgendamentoServico newAgendamentoServico = new AgendamentoServico();

    Agendamento agendamento = this.agendamentoBusiness.get(agendamentoId);

    newAgendamentoServico.setServico(entity);
    newAgendamentoServico.setAgendamento(agendamento);
    
    this.agendamentoServicoBusiness.post(newAgendamentoServico);

    return newAgendamentoServico.getAgendamento();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{agendamentoId}/Servico/{ServicoId}")
  public void deleteServico(@PathVariable("agendamentoId") java.lang.String agendamentoId, @PathVariable("ServicoId") java.lang.String ServicoId) {
    this.agendamentoBusiness.deleteServico(agendamentoId, ServicoId);
  }  

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{agendamentoId}")
  public Agendamento get(@PathVariable("agendamentoId") java.lang.String agendamentoId) throws Exception {
    return agendamentoBusiness.get(agendamentoId);
  }

  /**
   * Foreign Key cliente
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Cliente/{clienteId}")    
  public HttpEntity<List<AgendamentoDTO>> findAgendamentosByCliente(@PathVariable("clienteId") java.lang.String clienteId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(agendamentoBusiness.findAgendamentosByCliente(clienteId, pageable), HttpStatus.OK);
  }

  /**
   * Foreign Key funcionario
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Funcionario/{funcionarioId}")    
  public HttpEntity<List<AgendamentoDTO>> findAgendamentosByFuncionario(@PathVariable("funcionarioId") java.lang.String funcionarioId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(agendamentoBusiness.findAgendamentosByFuncionario(funcionarioId, pageable), HttpStatus.OK);
  }
  
  @RequestMapping(method = RequestMethod.GET, value="/listByDataFutura")
  public HttpEntity<List<AgendamentoDTO>> listByDataFutura(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(agendamentoBusiness.listByDataFutura(pageable), HttpStatus.OK);    
  }
  
}
