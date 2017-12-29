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
 * Controller para expor serviços REST de Cliente
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Cliente")
public class ClienteREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ClienteBusiness")
  private ClienteBusiness clienteBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("FuncionarioBusiness")
  private FuncionarioBusiness funcionarioBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("TelefoneBusiness")
  private TelefoneBusiness telefoneBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("EnderecoBusiness")
  private EnderecoBusiness enderecoBusiness;

  /**
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
  public Cliente post(@Validated @RequestBody final Cliente entity) throws Exception {
    return clienteBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Cliente put(@Validated @RequestBody final Cliente entity) throws Exception {
    return clienteBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{clienteId}")
  public Cliente put(@Validated @RequestBody final Cliente entity, @PathVariable("clienteId") java.lang.String clienteId) throws Exception {
    return clienteBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{clienteId}")
  public void delete(@PathVariable("clienteId") java.lang.String clienteId) throws Exception {
    clienteBusiness.delete(clienteId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Cliente>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(clienteBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{clienteId}/Telefone")    
  public HttpEntity<PagedResources<Telefone>> findTelefone(@PathVariable("clienteId") java.lang.String clienteId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(clienteBusiness.findTelefone(clienteId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{clienteId}/Telefone/{telefoneId}")    
  public void deleteTelefone(@PathVariable("telefoneId") java.lang.String telefoneId) throws Exception {
    this.telefoneBusiness.delete(telefoneId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{clienteId}/Telefone")
  public Telefone putTelefone(@Validated @RequestBody final Telefone entity, @PathVariable("clienteId") java.lang.String clienteId) throws Exception {
    return this.telefoneBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{clienteId}/Telefone")
  public Telefone postTelefone(@Validated @RequestBody final Telefone entity, @PathVariable("clienteId") java.lang.String clienteId) throws Exception {
    Cliente cliente = this.clienteBusiness.get(clienteId);
    entity.setCliente(cliente);
    return this.telefoneBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{clienteId}/Endereco")    
  public HttpEntity<PagedResources<Endereco>> findEndereco(@PathVariable("clienteId") java.lang.String clienteId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(clienteBusiness.findEndereco(clienteId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{clienteId}/Endereco/{enderecoId}")    
  public void deleteEndereco(@PathVariable("enderecoId") java.lang.String enderecoId) throws Exception {
    this.enderecoBusiness.delete(enderecoId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{clienteId}/Endereco")
  public Endereco putEndereco(@Validated @RequestBody final Endereco entity, @PathVariable("clienteId") java.lang.String clienteId) throws Exception {
    return this.enderecoBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{clienteId}/Endereco")
  public Endereco postEndereco(@Validated @RequestBody final Endereco entity, @PathVariable("clienteId") java.lang.String clienteId) throws Exception {
    Cliente cliente = this.clienteBusiness.get(clienteId);
    entity.setCliente(cliente);
    return this.enderecoBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{clienteId}/Agendamento")    
  public HttpEntity<PagedResources<Agendamento>> findAgendamento(@PathVariable("clienteId") java.lang.String clienteId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(clienteBusiness.findAgendamento(clienteId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{clienteId}/Agendamento/{agendamentoId}")    
  public void deleteAgendamento(@PathVariable("agendamentoId") java.lang.String agendamentoId) throws Exception {
    this.agendamentoBusiness.delete(agendamentoId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{clienteId}/Agendamento")
  public Agendamento putAgendamento(@Validated @RequestBody final Agendamento entity, @PathVariable("clienteId") java.lang.String clienteId) throws Exception {
    return this.agendamentoBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{clienteId}/Agendamento")
  public Agendamento postAgendamento(@Validated @RequestBody final Agendamento entity, @PathVariable("clienteId") java.lang.String clienteId) throws Exception {
    Cliente cliente = this.clienteBusiness.get(clienteId);
    entity.setCliente(cliente);
    return this.agendamentoBusiness.post(entity);
  }

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{clienteId}/Funcionario")
  public HttpEntity<PagedResources<Funcionario>> listFuncionario(@PathVariable("clienteId") java.lang.String clienteId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(clienteBusiness.listFuncionario(clienteId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{clienteId}/Funcionario")
  public Cliente postFuncionario(@Validated @RequestBody final Funcionario entity, @PathVariable("clienteId") java.lang.String clienteId) throws Exception {
    Telefone newTelefone = new Telefone();

    Cliente cliente = this.clienteBusiness.get(clienteId);

    newTelefone.setFuncionario(entity);
    newTelefone.setCliente(cliente);
    
    this.telefoneBusiness.post(newTelefone);

    return newTelefone.getCliente();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{clienteId}/Funcionario/{FuncionarioId}")
  public void deleteFuncionario(@PathVariable("clienteId") java.lang.String clienteId, @PathVariable("FuncionarioId") java.lang.String FuncionarioId) {
    this.clienteBusiness.deleteFuncionario(clienteId, FuncionarioId);
  }  

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{clienteId}/Funcionario_2")
  public HttpEntity<PagedResources<Funcionario>> listFuncionario_2(@PathVariable("clienteId") java.lang.String clienteId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(clienteBusiness.listFuncionario_2(clienteId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{clienteId}/Funcionario_2")
  public Cliente postFuncionario_2(@Validated @RequestBody final Funcionario entity, @PathVariable("clienteId") java.lang.String clienteId) throws Exception {
    Endereco newEndereco = new Endereco();

    Cliente cliente = this.clienteBusiness.get(clienteId);

    newEndereco.setFuncionario(entity);
    newEndereco.setCliente(cliente);
    
    this.enderecoBusiness.post(newEndereco);

    return newEndereco.getCliente();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{clienteId}/Funcionario_2/{Funcionario_2Id}")
  public void deleteFuncionario_2(@PathVariable("clienteId") java.lang.String clienteId, @PathVariable("Funcionario_2Id") java.lang.String Funcionario_2Id) {
    this.clienteBusiness.deleteFuncionario_2(clienteId, Funcionario_2Id);
  }  

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{clienteId}/Funcionario_3")
  public HttpEntity<PagedResources<Funcionario>> listFuncionario_3(@PathVariable("clienteId") java.lang.String clienteId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(clienteBusiness.listFuncionario_3(clienteId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{clienteId}/Funcionario_3")
  public Cliente postFuncionario_3(@Validated @RequestBody final Funcionario entity, @PathVariable("clienteId") java.lang.String clienteId) throws Exception {
    Agendamento newAgendamento = new Agendamento();

    Cliente cliente = this.clienteBusiness.get(clienteId);

    newAgendamento.setFuncionario(entity);
    newAgendamento.setCliente(cliente);
    
    this.agendamentoBusiness.post(newAgendamento);

    return newAgendamento.getCliente();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{clienteId}/Funcionario_3/{Funcionario_3Id}")
  public void deleteFuncionario_3(@PathVariable("clienteId") java.lang.String clienteId, @PathVariable("Funcionario_3Id") java.lang.String Funcionario_3Id) {
    this.clienteBusiness.deleteFuncionario_3(clienteId, Funcionario_3Id);
  }  

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{clienteId}")
  public Cliente get(@PathVariable("clienteId") java.lang.String clienteId) throws Exception {
    return clienteBusiness.get(clienteId);
  }
}
