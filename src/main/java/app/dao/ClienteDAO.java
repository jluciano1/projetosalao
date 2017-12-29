package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("ClienteDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ClienteDAO extends JpaRepository<Cliente, java.lang.String> {

  /**
   * Obtém a instância de Cliente utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Cliente entity WHERE entity.id = :id")
  public Cliente findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Cliente utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Cliente entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Cliente c")
  public Page<Cliente> list(Pageable pageable);
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Telefone entity WHERE entity.cliente.id = :id")
  public Page<Telefone> findTelefone(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Endereco entity WHERE entity.cliente.id = :id")
  public Page<Endereco> findEndereco(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Agendamento entity WHERE entity.cliente.id = :id")
  public Page<Agendamento> findAgendamento(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.funcionario FROM Telefone entity WHERE entity.cliente.id = :id")
  public Page<Funcionario> listFuncionario(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Telefone entity WHERE entity.cliente.id = :instanceId AND entity.funcionario.id = :relationId")
  public int deleteFuncionario(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.funcionario FROM Endereco entity WHERE entity.cliente.id = :id")
  public Page<Funcionario> listFuncionario_2(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Endereco entity WHERE entity.cliente.id = :instanceId AND entity.funcionario.id = :relationId")
  public int deleteFuncionario_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

}
