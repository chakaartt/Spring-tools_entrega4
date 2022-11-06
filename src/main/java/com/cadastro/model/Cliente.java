package com.cadastro.model;



import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name = "cliente")
public class Cliente {

	// variáveis//
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_cliente;
	
	@Column(name = "nome_cliente")
	private String nome_cliente;
	
	@Column(name = "email_cliente")
	private String email_cliente;
	
	@Column(name = "senha_cliente")
	private String senha_cliente;
	
	public Cliente() {
		super();
	}
	
	public Cliente(long id_cliente, String nome_cliente, String email_cliente, String senha_cliente) {
		super();
		this.id_cliente = (int) id_cliente;
		this.nome_cliente = nome_cliente;
		this.email_cliente = email_cliente;
		this.senha_cliente = senha_cliente;
	}
	public long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getEmail_cliente() {
		return email_cliente;
	}

	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}

	public String getSenha_cliente() {
		return senha_cliente;
	}

	public void setSenha_cliente(String senha_cliente) {
		this.senha_cliente = senha_cliente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_cliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return id_cliente == other.id_cliente;
	}

	public String toString() {
		return "Funcionario [id_cliente=" + id_cliente + ", nome_cliente=" + nome_cliente + ", email_cliente=" + email_cliente + ", senha_cliente="
				+ senha_cliente + "]";
	}
	
}
