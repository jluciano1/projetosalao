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
@Repository("ServicoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ServicoDAO extends JpaRepository<Servico, java.lang.String> {

  /**
   * Obtém a instância de Servico utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Servico entity WHERE entity.id = :id")
  public Servico findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Servico utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Servico entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Servico c")
  public Page<Servico> list(Pageable pageable);
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM AgendamentoServico entity WHERE entity.servico.id = :id")
  public Page<AgendamentoServico> findAgendamentoServico(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.agendamento FROM AgendamentoServico entity WHERE entity.servico.id = :id")
  public Page<Agendamento> listAgendamento(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM AgendamentoServico entity WHERE entity.servico.id = :instanceId AND entity.agendamento.id = :relationId")
  public int deleteAgendamento(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

}
