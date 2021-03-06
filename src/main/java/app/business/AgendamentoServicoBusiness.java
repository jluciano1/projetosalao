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
 * Classe que representa a camada de negócios de AgendamentoServicoBusiness
 * 
 * @generated
 **/
@Service("AgendamentoServicoBusiness")
public class AgendamentoServicoBusiness {



  /**
   * Instância da classe AgendamentoServicoDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("AgendamentoServicoDAO")
  protected AgendamentoServicoDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public AgendamentoServico post(final AgendamentoServico entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    AgendamentoServico result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public AgendamentoServico put(final AgendamentoServico entity) throws Exception {
    // begin-user-code  
    // end-user-code
    AgendamentoServico result = repository.saveAndFlush(entity);
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
    AgendamentoServico entity = this.get(id);
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
  public AgendamentoServico get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    AgendamentoServico result = repository.findOne(id);
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
  public Page<AgendamentoServico> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<AgendamentoServico> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Foreign Key agendamento
   * @generated
   */
  public Page<AgendamentoServico> findAgendamentoServicosByAgendamento(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<AgendamentoServico> result = repository.findAgendamentoServicosByAgendamento(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
  /**
   * Foreign Key servico
   * @generated
   */
  public Page<AgendamentoServico> findAgendamentoServicosByServico(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<AgendamentoServico> result = repository.findAgendamentoServicosByServico(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
