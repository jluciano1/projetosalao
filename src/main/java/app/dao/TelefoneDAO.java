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
@Repository("TelefoneDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface TelefoneDAO extends JpaRepository<Telefone, java.lang.String> {

  /**
   * Obtém a instância de Telefone utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Telefone entity WHERE entity.id = :id")
  public Telefone findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Telefone utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Telefone entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Telefone c")
  public Page<Telefone> list(Pageable pageable);
  


  /**
   * Foreign Key cliente
   * @generated
   */
  @Query("SELECT entity FROM Telefone entity WHERE entity.cliente.id = :id")
  public Page<Telefone> findTelefonesByCliente(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key funcionario
   * @generated
   */
  @Query("SELECT entity FROM Telefone entity WHERE entity.funcionario.id = :id")
  public Page<Telefone> findTelefonesByFuncionario(@Param(value="id") java.lang.String id, Pageable pageable);

}
