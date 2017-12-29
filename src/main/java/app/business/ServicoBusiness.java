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
 * Classe que representa a camada de negócios de ServicoBusiness
 * 
 * @generated
 **/
@Service("ServicoBusiness")
public class ServicoBusiness {



  /**
   * Instância da classe ServicoDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ServicoDAO")
  protected ServicoDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Servico post(final Servico entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Servico result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Servico put(final Servico entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Servico result = repository.saveAndFlush(entity);
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
    Servico entity = this.get(id);
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
  public Servico get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Servico result = repository.findOne(id);
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
  public Page<Servico> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Servico> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Agendamento> findAgendamento(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Agendamento> result = repository.findAgendamento(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
}
