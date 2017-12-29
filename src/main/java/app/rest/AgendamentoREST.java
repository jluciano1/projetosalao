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
  
  @RequestMapping(method = RequestMethod.GET, value="/listByDataFutura")
  public HttpEntity<PagedResources<Agendamento>> listByDataFutura(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(agendamentoBusiness.listByDataFutura(pageable)), HttpStatus.OK);    
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
   * Foreign Key servico
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Servico/{servicoId}")    
  public HttpEntity<PagedResources<Agendamento>> findAgendamentosByServico(@PathVariable("servicoId") java.lang.String servicoId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(agendamentoBusiness.findAgendamentosByServico(servicoId, pageable)), HttpStatus.OK);
  }

  /**
   * Foreign Key cliente
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Cliente/{clienteId}")    
  public HttpEntity<PagedResources<Agendamento>> findAgendamentosByCliente(@PathVariable("clienteId") java.lang.String clienteId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(agendamentoBusiness.findAgendamentosByCliente(clienteId, pageable)), HttpStatus.OK);
  }

  /**
   * Foreign Key funcionario
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Funcionario/{funcionarioId}")    
  public HttpEntity<PagedResources<Agendamento>> findAgendamentosByFuncionario(@PathVariable("funcionarioId") java.lang.String funcionarioId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(agendamentoBusiness.findAgendamentosByFuncionario(funcionarioId, pageable)), HttpStatus.OK);
  }
}
