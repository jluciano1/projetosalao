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
@Repository("AgendamentoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface AgendamentoDAO extends JpaRepository<Agendamento, java.lang.String> {

  /**
   * Obtém a instância de Agendamento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Agendamento entity WHERE entity.id = :id")
  public Agendamento findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Agendamento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Agendamento entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Agendamento c")
  public Page<Agendamento> list(Pageable pageable);
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select a from Agendamento a where a.cliente.id = :clienteId")
  public Page<Agendamento> listByCliente(@Param(value="clienteId") java.lang.String clienteId, Pageable pageable);
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select a from Agendamento a where a.funcionario.id = :funcionarioId")
  public Page<Agendamento> listByFuncionario(@Param(value="funcionarioId") java.lang.String funcionarioId, Pageable pageable);
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select a from Agendamento a where a.data = :data")
  public Page<Agendamento> listByData(@Param(value="data") java.util.Date data, Pageable pageable);
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM AgendamentoServico entity WHERE entity.agendamento.id = :id")
  public Page<AgendamentoServico> findAgendamentoServico(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.servico FROM AgendamentoServico entity WHERE entity.agendamento.id = :id")
  public Page<Servico> listServico(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM AgendamentoServico entity WHERE entity.agendamento.id = :instanceId AND entity.servico.id = :relationId")
  public int deleteServico(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key cliente
   * @generated
   */
  @Query("SELECT entity FROM Agendamento entity WHERE entity.cliente.id = :id")
  public Page<Agendamento> findAgendamentosByCliente(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key funcionario
   * @generated
   */
  @Query("SELECT entity FROM Agendamento entity WHERE entity.funcionario.id = :id")
  public Page<Agendamento> findAgendamentosByFuncionario(@Param(value="id") java.lang.String id, Pageable pageable);

  @Query("select a from Agendamento a where a.data > CURRENT_DATE")
  public Page<Agendamento> listByDataFutura(Pageable pageable);

}
