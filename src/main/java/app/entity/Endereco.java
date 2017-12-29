package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela ENDERECO
 * @generated
 */
@Entity
@Table(name = "\"ENDERECO\"")
@XmlRootElement
public class Endereco implements Serializable {

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
  @Column(name = "cep", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String cep;
  
  /**
  * @generated
  */
  @Column(name = "logradouro", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String logradouro;
  
  /**
  * @generated
  */
  @Column(name = "tipoLogradouro", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String tipoLogradouro;
  
  /**
  * @generated
  */
  @Column(name = "bairro", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String bairro;
  
  /**
  * @generated
  */
  @Column(name = "numero", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String numero;
  
  /**
  * @generated
  */
  @Column(name = "complemento", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String complemento;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_funcionario", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Funcionario funcionario;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_cliente", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Cliente cliente;
  
  /**
   * Construtor
   * @generated
   */
  public Endereco(){
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
  public Endereco setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém cep
   * return cep
   * @generated
   */
  public java.lang.String getCep(){
    return this.cep;
  }
  
  /**
   * Define cep
   * @param cep cep
   * @generated
   */
  public Endereco setCep(java.lang.String cep){
    this.cep = cep;
    return this;
  }
  
  /**
   * Obtém logradouro
   * return logradouro
   * @generated
   */
  public java.lang.String getLogradouro(){
    return this.logradouro;
  }
  
  /**
   * Define logradouro
   * @param logradouro logradouro
   * @generated
   */
  public Endereco setLogradouro(java.lang.String logradouro){
    this.logradouro = logradouro;
    return this;
  }
  
  /**
   * Obtém tipoLogradouro
   * return tipoLogradouro
   * @generated
   */
  public java.lang.String getTipoLogradouro(){
    return this.tipoLogradouro;
  }
  
  /**
   * Define tipoLogradouro
   * @param tipoLogradouro tipoLogradouro
   * @generated
   */
  public Endereco setTipoLogradouro(java.lang.String tipoLogradouro){
    this.tipoLogradouro = tipoLogradouro;
    return this;
  }
  
  /**
   * Obtém bairro
   * return bairro
   * @generated
   */
  public java.lang.String getBairro(){
    return this.bairro;
  }
  
  /**
   * Define bairro
   * @param bairro bairro
   * @generated
   */
  public Endereco setBairro(java.lang.String bairro){
    this.bairro = bairro;
    return this;
  }
  
  /**
   * Obtém numero
   * return numero
   * @generated
   */
  public java.lang.String getNumero(){
    return this.numero;
  }
  
  /**
   * Define numero
   * @param numero numero
   * @generated
   */
  public Endereco setNumero(java.lang.String numero){
    this.numero = numero;
    return this;
  }
  
  /**
   * Obtém complemento
   * return complemento
   * @generated
   */
  public java.lang.String getComplemento(){
    return this.complemento;
  }
  
  /**
   * Define complemento
   * @param complemento complemento
   * @generated
   */
  public Endereco setComplemento(java.lang.String complemento){
    this.complemento = complemento;
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
  public Endereco setFuncionario(Funcionario funcionario){
    this.funcionario = funcionario;
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
  public Endereco setCliente(Cliente cliente){
    this.cliente = cliente;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Endereco object = (Endereco)obj;
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
