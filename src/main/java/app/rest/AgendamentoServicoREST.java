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
 * Controller para expor serviços REST de AgendamentoServico
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/AgendamentoServico")
public class AgendamentoServicoREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
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
  public AgendamentoServico post(@Validated @RequestBody final AgendamentoServico entity) throws Exception {
    return agendamentoServicoBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public AgendamentoServico put(@Validated @RequestBody final AgendamentoServico entity) throws Exception {
    return agendamentoServicoBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{agendamentoServicoId}")
  public AgendamentoServico put(@Validated @RequestBody final AgendamentoServico entity, @PathVariable("agendamentoServicoId") java.lang.String agendamentoServicoId) throws Exception {
    return agendamentoServicoBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{agendamentoServicoId}")
  public void delete(@PathVariable("agendamentoServicoId") java.lang.String agendamentoServicoId) throws Exception {
    agendamentoServicoBusiness.delete(agendamentoServicoId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<AgendamentoServico>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(agendamentoServicoBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{agendamentoServicoId}")
  public AgendamentoServico get(@PathVariable("agendamentoServicoId") java.lang.String agendamentoServicoId) throws Exception {
    return agendamentoServicoBusiness.get(agendamentoServicoId);
  }

  /**
   * Foreign Key agendamento
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Agendamento/{agendamentoId}")    
  public HttpEntity<PagedResources<AgendamentoServico>> findAgendamentoServicosByAgendamento(@PathVariable("agendamentoId") java.lang.String agendamentoId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(agendamentoServicoBusiness.findAgendamentoServicosByAgendamento(agendamentoId, pageable)), HttpStatus.OK);
  }

  /**
   * Foreign Key servico
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Servico/{servicoId}")    
  public HttpEntity<PagedResources<AgendamentoServico>> findAgendamentoServicosByServico(@PathVariable("servicoId") java.lang.String servicoId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(agendamentoServicoBusiness.findAgendamentoServicosByServico(servicoId, pageable)), HttpStatus.OK);
  }
}
