package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela HISTORICO
 * @generated
 */
@Entity
@Table(name = "\"HISTORICO\"")
@XmlRootElement
public class Historico implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  
  /**
  * @generated
  */
  @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String descricao;
  
  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_agendamento", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Agendamento agendamento;
  
  /**
   * Construtor
   * @generated
   */
  public Historico(){
  }

  
  /**
   * Obtém id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public Historico setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém descricao
   * return descricao
   * @generated
   */
  public java.lang.String getDescricao(){
    return this.descricao;
  }
  
  /**
   * Define descricao
   * @param descricao descricao
   * @generated
   */
  public Historico setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }
  
  /**
   * Obtém agendamento
   * return agendamento
   * @generated
   */
  public Agendamento getAgendamento(){
    return this.agendamento;
  }
  
  /**
   * Define agendamento
   * @param agendamento agendamento
   * @generated
   */
  public Historico setAgendamento(Agendamento agendamento){
    this.agendamento = agendamento;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Historico object = (Historico)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  
}
