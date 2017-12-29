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
 * Controller para expor serviços REST de Funcionario
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Funcionario")
public class FuncionarioREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("FuncionarioBusiness")
  private FuncionarioBusiness funcionarioBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("ClienteBusiness")
  private ClienteBusiness clienteBusiness;

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
  public Funcionario post(@Validated @RequestBody final Funcionario entity) throws Exception {
    return funcionarioBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Funcionario put(@Validated @RequestBody final Funcionario entity) throws Exception {
    return funcionarioBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{funcionarioId}")
  public Funcionario put(@Validated @RequestBody final Funcionario entity, @PathVariable("funcionarioId") java.lang.String funcionarioId) throws Exception {
    return funcionarioBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{funcionarioId}")
  public void delete(@PathVariable("funcionarioId") java.lang.String funcionarioId) throws Exception {
    funcionarioBusiness.delete(funcionarioId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Funcionario>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(funcionarioBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{funcionarioId}/Telefone")    
  public HttpEntity<PagedResources<Telefone>> findTelefone(@PathVariable("funcionarioId") java.lang.String funcionarioId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(funcionarioBusiness.findTelefone(funcionarioId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{funcionarioId}/Telefone/{telefoneId}")    
  public void deleteTelefone(@PathVariable("telefoneId") java.lang.String telefoneId) throws Exception {
    this.telefoneBusiness.delete(telefoneId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{funcionarioId}/Telefone")
  public Telefone putTelefone(@Validated @RequestBody final Telefone entity, @PathVariable("funcionarioId") java.lang.String funcionarioId) throws Exception {
    return this.telefoneBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{funcionarioId}/Telefone")
  public Telefone postTelefone(@Validated @RequestBody final Telefone entity, @PathVariable("funcionarioId") java.lang.String funcionarioId) throws Exception {
    Funcionario funcionario = this.funcionarioBusiness.get(funcionarioId);
    entity.setFuncionario(funcionario);
    return this.telefoneBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{funcionarioId}/Endereco")    
  public HttpEntity<PagedResources<Endereco>> findEndereco(@PathVariable("funcionarioId") java.lang.String funcionarioId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(funcionarioBusiness.findEndereco(funcionarioId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{funcionarioId}/Endereco/{enderecoId}")    
  public void deleteEndereco(@PathVariable("enderecoId") java.lang.String enderecoId) throws Exception {
    this.enderecoBusiness.delete(enderecoId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{funcionarioId}/Endereco")
  public Endereco putEndereco(@Validated @RequestBody final Endereco entity, @PathVariable("funcionarioId") java.lang.String funcionarioId) throws Exception {
    return this.enderecoBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{funcionarioId}/Endereco")
  public Endereco postEndereco(@Validated @RequestBody final Endereco entity, @PathVariable("funcionarioId") java.lang.String funcionarioId) throws Exception {
    Funcionario funcionario = this.funcionarioBusiness.get(funcionarioId);
    entity.setFuncionario(funcionario);
    return this.enderecoBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{funcionarioId}/Agendamento")    
  public HttpEntity<PagedResources<Agendamento>> findAgendamento(@PathVariable("funcionarioId") java.lang.String funcionarioId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(funcionarioBusiness.findAgendamento(funcionarioId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{funcionarioId}/Agendamento/{agendamentoId}")    
  public void deleteAgendamento(@PathVariable("agendamentoId") java.lang.String agendamentoId) throws Exception {
    this.agendamentoBusiness.delete(agendamentoId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{funcionarioId}/Agendamento")
  public Agendamento putAgendamento(@Validated @RequestBody final Agendamento entity, @PathVariable("funcionarioId") java.lang.String funcionarioId) throws Exception {
    return this.agendamentoBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{funcionarioId}/Agendamento")
  public Agendamento postAgendamento(@Validated @RequestBody final Agendamento entity, @PathVariable("funcionarioId") java.lang.String funcionarioId) throws Exception {
    Funcionario funcionario = this.funcionarioBusiness.get(funcionarioId);
    entity.setFuncionario(funcionario);
    return this.agendamentoBusiness.post(entity);
  }

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{funcionarioId}/Cliente")
  public HttpEntity<PagedResources<Cliente>> listCliente(@PathVariable("funcionarioId") java.lang.String funcionarioId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(funcionarioBusiness.listCliente(funcionarioId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{funcionarioId}/Cliente")
  public Funcionario postCliente(@Validated @RequestBody final Cliente entity, @PathVariable("funcionarioId") java.lang.String funcionarioId) throws Exception {
    Telefone newTelefone = new Telefone();

    Funcionario funcionario = this.funcionarioBusiness.get(funcionarioId);

    newTelefone.setCliente(entity);
    newTelefone.setFuncionario(funcionario);
    
    this.telefoneBusiness.post(newTelefone);

    return newTelefone.getFuncionario();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{funcionarioId}/Cliente/{ClienteId}")
  public void deleteCliente(@PathVariable("funcionarioId") java.lang.String funcionarioId, @PathVariable("ClienteId") java.lang.String ClienteId) {
    this.funcionarioBusiness.deleteCliente(funcionarioId, ClienteId);
  }  

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{funcionarioId}/Cliente_2")
  public HttpEntity<PagedResources<Cliente>> listCliente_2(@PathVariable("funcionarioId") java.lang.String funcionarioId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(funcionarioBusiness.listCliente_2(funcionarioId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{funcionarioId}/Cliente_2")
  public Funcionario postCliente_2(@Validated @RequestBody final Cliente entity, @PathVariable("funcionarioId") java.lang.String funcionarioId) throws Exception {
    Endereco newEndereco = new Endereco();

    Funcionario funcionario = this.funcionarioBusiness.get(funcionarioId);

    newEndereco.setCliente(entity);
    newEndereco.setFuncionario(funcionario);
    
    this.enderecoBusiness.post(newEndereco);

    return newEndereco.getFuncionario();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{funcionarioId}/Cliente_2/{Cliente_2Id}")
  public void deleteCliente_2(@PathVariable("funcionarioId") java.lang.String funcionarioId, @PathVariable("Cliente_2Id") java.lang.String Cliente_2Id) {
    this.funcionarioBusiness.deleteCliente_2(funcionarioId, Cliente_2Id);
  }  

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{funcionarioId}/Cliente_3")
  public HttpEntity<PagedResources<Cliente>> listCliente_3(@PathVariable("funcionarioId") java.lang.String funcionarioId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(funcionarioBusiness.listCliente_3(funcionarioId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{funcionarioId}/Cliente_3")
  public Funcionario postCliente_3(@Validated @RequestBody final Cliente entity, @PathVariable("funcionarioId") java.lang.String funcionarioId) throws Exception {
    Agendamento newAgendamento = new Agendamento();

    Funcionario funcionario = this.funcionarioBusiness.get(funcionarioId);

    newAgendamento.setCliente(entity);
    newAgendamento.setFuncionario(funcionario);
    
    this.agendamentoBusiness.post(newAgendamento);

    return newAgendamento.getFuncionario();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{funcionarioId}/Cliente_3/{Cliente_3Id}")
  public void deleteCliente_3(@PathVariable("funcionarioId") java.lang.String funcionarioId, @PathVariable("Cliente_3Id") java.lang.String Cliente_3Id) {
    this.funcionarioBusiness.deleteCliente_3(funcionarioId, Cliente_3Id);
  }  

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{funcionarioId}")
  public Funcionario get(@PathVariable("funcionarioId") java.lang.String funcionarioId) throws Exception {
    return funcionarioBusiness.get(funcionarioId);
  }
}
