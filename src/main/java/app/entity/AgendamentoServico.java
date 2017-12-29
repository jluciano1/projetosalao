package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela AGENDAMENTOSERVICO
 * @generated
 */
@Entity
@Table(name = "\"AGENDAMENTOSERVICO\"")
@XmlRootElement
public class AgendamentoServico implements Serializable {

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
  @ManyToOne
  @JoinColumn(name="fk_agendamento", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Agendamento agendamento;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_servico", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Servico servico;
  
  /**
   * Construtor
   * @generated
   */
  public AgendamentoServico(){
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
  public AgendamentoServico setId(java.lang.String id){
    this.id = id;
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
  public AgendamentoServico setAgendamento(Agendamento agendamento){
    this.agendamento = agendamento;
    return this;
  }
  
  /**
   * Obtém servico
   * return servico
   * @generated
   */
  public Servico getServico(){
    return this.servico;
  }
  
  /**
   * Define servico
   * @param servico servico
   * @generated
   */
  public AgendamentoServico setServico(Servico servico){
    this.servico = servico;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    AgendamentoServico object = (AgendamentoServico)obj;
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
