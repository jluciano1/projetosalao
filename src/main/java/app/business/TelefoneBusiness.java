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
 * Classe que representa a camada de negócios de TelefoneBusiness
 * 
 * @generated
 **/
@Service("TelefoneBusiness")
public class TelefoneBusiness {



  /**
   * Instância da classe TelefoneDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("TelefoneDAO")
  protected TelefoneDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Telefone post(final Telefone entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Telefone result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Telefone put(final Telefone entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Telefone result = repository.saveAndFlush(entity);
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
    Telefone entity = this.get(id);
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
  public Telefone get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Telefone result = repository.findOne(id);
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
  public Page<Telefone> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Telefone> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Foreign Key cliente
   * @generated
   */
  public Page<Telefone> findTelefonesByCliente(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Telefone> result = repository.findTelefonesByCliente(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
  /**
   * Foreign Key funcionario
   * @generated
   */
  public Page<Telefone> findTelefonesByFuncionario(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Telefone> result = repository.findTelefonesByFuncionario(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
