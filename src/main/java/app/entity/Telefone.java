package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela TELEFONE
 * @generated
 */
@Entity
@Table(name = "\"TELEFONE\"")
@XmlRootElement
public class Telefone implements Serializable {

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
  @Column(name = "numero", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer numero;
  
  /**
  * @generated
  */
  @Column(name = "ddd", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  private java.lang.Integer ddd;
  
  /**
  * @generated
  */
  @Column(name = "tipo", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String tipo;
  
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
  public Telefone(){
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
  public Telefone setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém numero
   * return numero
   * @generated
   */
  public java.lang.Integer getNumero(){
    return this.numero;
  }
  
  /**
   * Define numero
   * @param numero numero
   * @generated
   */
  public Telefone setNumero(java.lang.Integer numero){
    this.numero = numero;
    return this;
  }
  
  /**
   * Obtém ddd
   * return ddd
   * @generated
   */
  public java.lang.Integer getDdd(){
    return this.ddd;
  }
  
  /**
   * Define ddd
   * @param ddd ddd
   * @generated
   */
  public Telefone setDdd(java.lang.Integer ddd){
    this.ddd = ddd;
    return this;
  }
  
  /**
   * Obtém tipo
   * return tipo
   * @generated
   */
  public java.lang.String getTipo(){
    return this.tipo;
  }
  
  /**
   * Define tipo
   * @param tipo tipo
   * @generated
   */
  public Telefone setTipo(java.lang.String tipo){
    this.tipo = tipo;
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
  public Telefone setCliente(Cliente cliente){
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
  public Telefone setFuncionario(Funcionario funcionario){
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
    Telefone object = (Telefone)obj;
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
