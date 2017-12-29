package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela SERVICO
 * @generated
 */
@Entity
@Table(name = "\"SERVICO\"")
@XmlRootElement
public class Servico implements Serializable {

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
  @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String descricao;
  
  /**
  * @generated
  */
  @Column(name = "valorServico", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Double valorServico;
  
  /**
   * Construtor
   * @generated
   */
  public Servico(){
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
  public Servico setId(java.lang.String id){
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
  public Servico setNome(java.lang.String nome){
    this.nome = nome;
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
  public Servico setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }
  
  /**
   * Obtém valorServico
   * return valorServico
   * @generated
   */
  public java.lang.Double getValorServico(){
    return this.valorServico;
  }
  
  /**
   * Define valorServico
   * @param valorServico valorServico
   * @generated
   */
  public Servico setValorServico(java.lang.Double valorServico){
    this.valorServico = valorServico;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Servico object = (Servico)obj;
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
