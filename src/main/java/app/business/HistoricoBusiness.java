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
 * Classe que representa a camada de negócios de HistoricoBusiness
 * 
 * @generated
 **/
@Service("HistoricoBusiness")
public class HistoricoBusiness {



  /**
   * Instância da classe HistoricoDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("HistoricoDAO")
  protected HistoricoDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Historico post(final Historico entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Historico result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Historico put(final Historico entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Historico result = repository.saveAndFlush(entity);
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
    Historico entity = this.get(id);
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
  public Historico get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Historico result = repository.findOne(id);
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
  public Page<Historico> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Historico> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
}
