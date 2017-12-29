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
 * Controller para expor serviços REST de Historico
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Historico")
public class HistoricoREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("HistoricoBusiness")
  private HistoricoBusiness historicoBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Historico post(@Validated @RequestBody final Historico entity) throws Exception {
    return historicoBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Historico put(@Validated @RequestBody final Historico entity) throws Exception {
    return historicoBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{historicoId}")
  public Historico put(@Validated @RequestBody final Historico entity, @PathVariable("historicoId") java.lang.String historicoId) throws Exception {
    return historicoBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{historicoId}")
  public void delete(@PathVariable("historicoId") java.lang.String historicoId) throws Exception {
    historicoBusiness.delete(historicoId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Historico>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(historicoBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{historicoId}")
  public Historico get(@PathVariable("historicoId") java.lang.String historicoId) throws Exception {
    return historicoBusiness.get(historicoId);
  }
}
