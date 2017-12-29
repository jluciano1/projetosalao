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
 * Controller para expor serviços REST de Endereco
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Endereco")
public class EnderecoREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("EnderecoBusiness")
  private EnderecoBusiness enderecoBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Endereco post(@Validated @RequestBody final Endereco entity) throws Exception {
    return enderecoBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Endereco put(@Validated @RequestBody final Endereco entity) throws Exception {
    return enderecoBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{enderecoId}")
  public Endereco put(@Validated @RequestBody final Endereco entity, @PathVariable("enderecoId") java.lang.String enderecoId) throws Exception {
    return enderecoBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{enderecoId}")
  public void delete(@PathVariable("enderecoId") java.lang.String enderecoId) throws Exception {
    enderecoBusiness.delete(enderecoId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Endereco>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(enderecoBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{enderecoId}")
  public Endereco get(@PathVariable("enderecoId") java.lang.String enderecoId) throws Exception {
    return enderecoBusiness.get(enderecoId);
  }

  /**
   * Foreign Key funcionario
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Funcionario/{funcionarioId}")    
  public HttpEntity<PagedResources<Endereco>> findEnderecosByFuncionario(@PathVariable("funcionarioId") java.lang.String funcionarioId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(enderecoBusiness.findEnderecosByFuncionario(funcionarioId, pageable)), HttpStatus.OK);
  }

  /**
   * Foreign Key cliente
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Cliente/{clienteId}")    
  public HttpEntity<PagedResources<Endereco>> findEnderecosByCliente(@PathVariable("clienteId") java.lang.String clienteId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(enderecoBusiness.findEnderecosByCliente(clienteId, pageable)), HttpStatus.OK);
  }
}
