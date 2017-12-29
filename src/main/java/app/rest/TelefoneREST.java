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
 * Controller para expor serviços REST de Telefone
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Telefone")
public class TelefoneREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("TelefoneBusiness")
  private TelefoneBusiness telefoneBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Telefone post(@Validated @RequestBody final Telefone entity) throws Exception {
    return telefoneBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Telefone put(@Validated @RequestBody final Telefone entity) throws Exception {
    return telefoneBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{telefoneId}")
  public Telefone put(@Validated @RequestBody final Telefone entity, @PathVariable("telefoneId") java.lang.String telefoneId) throws Exception {
    return telefoneBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{telefoneId}")
  public void delete(@PathVariable("telefoneId") java.lang.String telefoneId) throws Exception {
    telefoneBusiness.delete(telefoneId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Telefone>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(telefoneBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{telefoneId}")
  public Telefone get(@PathVariable("telefoneId") java.lang.String telefoneId) throws Exception {
    return telefoneBusiness.get(telefoneId);
  }

  /**
   * Foreign Key cliente
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Cliente/{clienteId}")    
  public HttpEntity<PagedResources<Telefone>> findTelefonesByCliente(@PathVariable("clienteId") java.lang.String clienteId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(telefoneBusiness.findTelefonesByCliente(clienteId, pageable)), HttpStatus.OK);
  }

  /**
   * Foreign Key funcionario
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Funcionario/{funcionarioId}")    
  public HttpEntity<PagedResources<Telefone>> findTelefonesByFuncionario(@PathVariable("funcionarioId") java.lang.String funcionarioId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(telefoneBusiness.findTelefonesByFuncionario(funcionarioId, pageable)), HttpStatus.OK);
  }
}
