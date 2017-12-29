package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela AGENDAMENTO
 * @generated
 */
@Entity
@Table(name = "\"AGENDAMENTO\"")
@XmlRootElement
public class Agendamento implements Serializable {

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
  @Temporal(TemporalType.DATE)
  @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date data;
  
  /**
  * @generated
  */
  @Column(name = "hora", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer hora;
  
  /**
  * @generated
  */
  @Transient
  private java.lang.Double valorTotal;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_servico", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Servico servico;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_cliente", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Cliente cliente;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_funcionario", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Funcionario funcionario;
  
  /**
   * Construtor
   * @generated
   */
  public Agendamento(){
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
  public Agendamento setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém data
   * return data
   * @generated
   */
  public java.util.Date getData(){
    return this.data;
  }
  
  /**
   * Define data
   * @param data data
   * @generated
   */
  public Agendamento setData(java.util.Date data){
    this.data = data;
    return this;
  }
  
  /**
   * Obtém hora
   * return hora
   * @generated
   */
  public java.lang.Integer getHora(){
    return this.hora;
  }
  
  /**
   * Define hora
   * @param hora hora
   * @generated
   */
  public Agendamento setHora(java.lang.Integer hora){
    this.hora = hora;
    return this;
  }
  
  /**
   * Obtém valorTotal
   * return valorTotal
   * @generated
   */
  public java.lang.Double getValorTotal(){
    return this.valorTotal;
  }
  
  /**
   * Define valorTotal
   * @param valorTotal valorTotal
   * @generated
   */
  public Agendamento setValorTotal(java.lang.Double valorTotal){
    this.valorTotal = valorTotal;
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
  public Agendamento setServico(Servico servico){
    this.servico = servico;
    return this;
  }
  
  /**
   * Obtém cliente
   * return cliente
   * @generated
   */
  public Cliente getCliente(){
    return this.cliente;
  }
  
  /**
   * Define cliente
   * @param cliente cliente
   * @generated
   */
  public Agendamento setCliente(Cliente cliente){
    this.cliente = cliente;
    return this;
  }
  
  /**
   * Obtém funcionario
   * return funcionario
   * @generated
   */
  public Funcionario getFuncionario(){
    return this.funcionario;
  }
  
  /**
   * Define funcionario
   * @param funcionario funcionario
   * @generated
   */
  public Agendamento setFuncionario(Funcionario funcionario){
    this.funcionario = funcionario;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Agendamento object = (Agendamento)obj;
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
