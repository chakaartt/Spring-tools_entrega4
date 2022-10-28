package com.cadastro.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "cliente", schema = "agencia")
public class Cliente {

	// variáveis//
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cliente;
	
	@Column(name = "nome_cliente")
	private String nome_cliente;
	
	@Column(name = "email_cliente")
	private String email_cliente;
	
	@Column(name = "senha_cliente")
	private String senha_cliente;

	
}
