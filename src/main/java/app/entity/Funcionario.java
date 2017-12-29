package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela FUNCIONARIO
 * @generated
 */
@Entity
@Table(name = "\"FUNCIONARIO\"")
@XmlRootElement
public class Funcionario implements Serializable {

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
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nome;
  
  /**
  * @generated
  */
  @Column(name = "email", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String email;
  
  /**
  * @generated
  */
  @Column(name = "tipo", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String tipo;
  
  /**
  * @generated
  */
  @Column(name = "ramoEmprego", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String ramoEmprego;
  
  /**
  * @generated
  */
  @Column(name = "valorSalario", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String valorSalario;
  
  /**
  * @generated
  */
  @Column(name = "ValorComissao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String valorComissao;
  
  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private User user;
  
  /**
   * Construtor
   * @generated
   */
  public Funcionario(){
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
  public Funcionario setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém nome
   * return nome
   * @generated
   */
  public java.lang.String getNome(){
    return this.nome;
  }
  
  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Funcionario setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  /**
   * Obtém email
   * return email
   * @generated
   */
  public java.lang.String getEmail(){
    return this.email;
  }
  
  /**
   * Define email
   * @param email email
   * @generated
   */
  public Funcionario setEmail(java.lang.String email){
    this.email = email;
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
  public Funcionario setTipo(java.lang.String tipo){
    this.tipo = tipo;
    return this;
  }
  
  /**
   * Obtém ramoEmprego
   * return ramoEmprego
   * @generated
   */
  public java.lang.String getRamoEmprego(){
    return this.ramoEmprego;
  }
  
  /**
   * Define ramoEmprego
   * @param ramoEmprego ramoEmprego
   * @generated
   */
  public Funcionario setRamoEmprego(java.lang.String ramoEmprego){
    this.ramoEmprego = ramoEmprego;
    return this;
  }
  
  /**
   * Obtém valorSalario
   * return valorSalario
   * @generated
   */
  public java.lang.String getValorSalario(){
    return this.valorSalario;
  }
  
  /**
   * Define valorSalario
   * @param valorSalario valorSalario
   * @generated
   */
  public Funcionario setValorSalario(java.lang.String valorSalario){
    this.valorSalario = valorSalario;
    return this;
  }
  
  /**
   * Obtém valorComissao
   * return valorComissao
   * @generated
   */
  public java.lang.String getValorComissao(){
    return this.valorComissao;
  }
  
  /**
   * Define valorComissao
   * @param valorComissao valorComissao
   * @generated
   */
  public Funcionario setValorComissao(java.lang.String valorComissao){
    this.valorComissao = valorComissao;
    return this;
  }
  
  /**
   * Obtém user
   * return user
   * @generated
   */
  public User getUser(){
    return this.user;
  }
  
  /**
   * Define user
   * @param user user
   * @generated
   */
  public Funcionario setUser(User user){
    this.user = user;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Funcionario object = (Funcionario)obj;
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
