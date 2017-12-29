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
 * Classe que representa a camada de negócios de ClienteBusiness
 * 
 * @generated
 **/
@Service("ClienteBusiness")
public class ClienteBusiness {



  /**
   * Instância da classe ClienteDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ClienteDAO")
  protected ClienteDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Cliente post(final Cliente entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Cliente result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Cliente put(final Cliente entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Cliente result = repository.saveAndFlush(entity);
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
    Cliente entity = this.get(id);
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
  public Cliente get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Cliente result = repository.findOne(id);
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
  public Page<Cliente> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Cliente> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Telefone> findTelefone(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Telefone> result = repository.findTelefone(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Endereco> findEndereco(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Endereco> result = repository.findEndereco(id, pageable);
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
  /**
   * @generated modifiable
   * ManyToMany Relation
   */  
  public Page<Funcionario> listFuncionario(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Funcionario> result = repository.listFuncionario(id, pageable);
    // begin-user-code
    // end-user-code
    return result;            
  }
  
  /**
   * @generated modifiable
   * ManyToMany Relation
   */    
  public int deleteFuncionario(java.lang.String instanceId, java.lang.String relationId) {
    // begin-user-code
    // end-user-code  
    int result = repository.deleteFuncionario(instanceId, relationId);
    // begin-user-code
    // end-user-code  
    return result;  
  }
  /**
   * @generated modifiable
   * ManyToMany Relation
   */  
  public Page<Funcionario> listFuncionario_2(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Funcionario> result = repository.listFuncionario_2(id, pageable);
    // begin-user-code
    // end-user-code
    return result;            
  }
  
  /**
   * @generated modifiable
   * ManyToMany Relation
   */    
  public int deleteFuncionario_2(java.lang.String instanceId, java.lang.String relationId) {
    // begin-user-code
    // end-user-code  
    int result = repository.deleteFuncionario_2(instanceId, relationId);
    // begin-user-code
    // end-user-code  
    return result;  
  }
  /**
   * @generated modifiable
   * ManyToMany Relation
   */  
  public Page<Funcionario> listFuncionario_3(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Funcionario> result = repository.listFuncionario_3(id, pageable);
    // begin-user-code
    // end-user-code
    return result;            
  }
  
  /**
   * @generated modifiable
   * ManyToMany Relation
   */    
  public int deleteFuncionario_3(java.lang.String instanceId, java.lang.String relationId) {
    // begin-user-code
    // end-user-code  
    int result = repository.deleteFuncionario_3(instanceId, relationId);
    // begin-user-code
    // end-user-code  
    return result;  
  }
}
