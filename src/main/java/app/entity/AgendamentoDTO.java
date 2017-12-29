package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

@XmlRootElement
public class AgendamentoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private java.lang.String id;

	private java.util.Date data;

	private java.lang.Integer hora;

	private java.lang.Double valorTotal;

	private Cliente cliente;

	private Funcionario funcionario;

	private List<AgendamentoServico> servicos;

	public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.util.Date getData() {
		return data;
	}

	public void setData(java.util.Date data) {
		this.data = data;
	}

	public java.lang.Integer getHora() {
		return hora;
	}

	public void setHora(java.lang.Integer hora) {
		this.hora = hora;
	}

	public java.lang.Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(java.lang.Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<AgendamentoServico> getServicos() {
		return servicos;
	}

	public void setServicos(List<AgendamentoServico> servicos) {
		this.servicos = servicos;
	}

}
