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
 * Controller para expor serviços REST de Servico
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Servico")
public class ServicoREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ServicoBusiness")
  private ServicoBusiness servicoBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("AgendamentoBusiness")
  private AgendamentoBusiness agendamentoBusiness;

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
  public Servico post(@Validated @RequestBody final Servico entity) throws Exception {
    return servicoBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Servico put(@Validated @RequestBody final Servico entity) throws Exception {
    return servicoBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{servicoId}")
  public Servico put(@Validated @RequestBody final Servico entity, @PathVariable("servicoId") java.lang.String servicoId) throws Exception {
    return servicoBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{servicoId}")
  public void delete(@PathVariable("servicoId") java.lang.String servicoId) throws Exception {
    servicoBusiness.delete(servicoId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Servico>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(servicoBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{servicoId}/AgendamentoServico")    
  public HttpEntity<PagedResources<AgendamentoServico>> findAgendamentoServico(@PathVariable("servicoId") java.lang.String servicoId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(servicoBusiness.findAgendamentoServico(servicoId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{servicoId}/AgendamentoServico/{agendamentoServicoId}")    
  public void deleteAgendamentoServico(@PathVariable("agendamentoServicoId") java.lang.String agendamentoServicoId) throws Exception {
    this.agendamentoServicoBusiness.delete(agendamentoServicoId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{servicoId}/AgendamentoServico")
  public AgendamentoServico putAgendamentoServico(@Validated @RequestBody final AgendamentoServico entity, @PathVariable("servicoId") java.lang.String servicoId) throws Exception {
    return this.agendamentoServicoBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{servicoId}/AgendamentoServico")
  public AgendamentoServico postAgendamentoServico(@Validated @RequestBody final AgendamentoServico entity, @PathVariable("servicoId") java.lang.String servicoId) throws Exception {
    Servico servico = this.servicoBusiness.get(servicoId);
    entity.setServico(servico);
    return this.agendamentoServicoBusiness.post(entity);
  }

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{servicoId}/Agendamento")
  public HttpEntity<PagedResources<Agendamento>> listAgendamento(@PathVariable("servicoId") java.lang.String servicoId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(servicoBusiness.listAgendamento(servicoId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{servicoId}/Agendamento")
  public Servico postAgendamento(@Validated @RequestBody final Agendamento entity, @PathVariable("servicoId") java.lang.String servicoId) throws Exception {
    AgendamentoServico newAgendamentoServico = new AgendamentoServico();

    Servico servico = this.servicoBusiness.get(servicoId);

    newAgendamentoServico.setAgendamento(entity);
    newAgendamentoServico.setServico(servico);
    
    this.agendamentoServicoBusiness.post(newAgendamentoServico);

    return newAgendamentoServico.getServico();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{servicoId}/Agendamento/{AgendamentoId}")
  public void deleteAgendamento(@PathVariable("servicoId") java.lang.String servicoId, @PathVariable("AgendamentoId") java.lang.String AgendamentoId) {
    this.servicoBusiness.deleteAgendamento(servicoId, AgendamentoId);
  }  

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{servicoId}")
  public Servico get(@PathVariable("servicoId") java.lang.String servicoId) throws Exception {
    return servicoBusiness.get(servicoId);
  }
}
