package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela CLIENTE
 * @generated
 */
@Entity
@Table(name = "\"CLIENTE\"")
@XmlRootElement
public class Cliente implements Serializable {

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
  @Column(name = "rg", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String rg;
  
  /**
  * @generated
  */
  @Column(name = "cpf", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String cpf;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dataNascimento", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date dataNascimento;
  
  /**
  * @generated
  */
  @Column(name = "sexo", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String sexo;
  
  /**
  * @generated
  */
  @Column(name = "apelido", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String apelido;
  
  /**
  * @generated
  */
  @Column(name = "indicadoPor", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String indicadoPor;
  
  /**
   * Construtor
   * @generated
   */
  public Cliente(){
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
  public Cliente setId(java.lang.String id){
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
  public Cliente setNome(java.lang.String nome){
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
  public Cliente setEmail(java.lang.String email){
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
  public Cliente setTipo(java.lang.String tipo){
    this.tipo = tipo;
    return this;
  }
  
  /**
   * Obtém rg
   * return rg
   * @generated
   */
  public java.lang.String getRg(){
    return this.rg;
  }
  
  /**
   * Define rg
   * @param rg rg
   * @generated
   */
  public Cliente setRg(java.lang.String rg){
    this.rg = rg;
    return this;
  }
  
  /**
   * Obtém cpf
   * return cpf
   * @generated
   */
  public java.lang.String getCpf(){
    return this.cpf;
  }
  
  /**
   * Define cpf
   * @param cpf cpf
   * @generated
   */
  public Cliente setCpf(java.lang.String cpf){
    this.cpf = cpf;
    return this;
  }
  
  /**
   * Obtém dataNascimento
   * return dataNascimento
   * @generated
   */
  public java.util.Date getDataNascimento(){
    return this.dataNascimento;
  }
  
  /**
   * Define dataNascimento
   * @param dataNascimento dataNascimento
   * @generated
   */
  public Cliente setDataNascimento(java.util.Date dataNascimento){
    this.dataNascimento = dataNascimento;
    return this;
  }
  
  /**
   * Obtém sexo
   * return sexo
   * @generated
   */
  public java.lang.String getSexo(){
    return this.sexo;
  }
  
  /**
   * Define sexo
   * @param sexo sexo
   * @generated
   */
  public Cliente setSexo(java.lang.String sexo){
    this.sexo = sexo;
    return this;
  }
  
  /**
   * Obtém apelido
   * return apelido
   * @generated
   */
  public java.lang.String getApelido(){
    return this.apelido;
  }
  
  /**
   * Define apelido
   * @param apelido apelido
   * @generated
   */
  public Cliente setApelido(java.lang.String apelido){
    this.apelido = apelido;
    return this;
  }
  
  /**
   * Obtém indicadoPor
   * return indicadoPor
   * @generated
   */
  public java.lang.String getIndicadoPor(){
    return this.indicadoPor;
  }
  
  /**
   * Define indicadoPor
   * @param indicadoPor indicadoPor
   * @generated
   */
  public Cliente setIndicadoPor(java.lang.String indicadoPor){
    this.indicadoPor = indicadoPor;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Cliente object = (Cliente)obj;
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
