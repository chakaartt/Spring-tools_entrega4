package com.cadastro.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "viagem", schema = "agencia")

public class Viagem {

	@Id
	@Column(name = "id_viagem")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_viagem;
	
	@Column
	private String nome_viagem;
	
	@Column
	private double valor_viagem;
	
	@Column
	private double numero_viagem;

	@Override
	public int hashCode() {
		return Objects.hash(id_viagem, nome_viagem, numero_viagem, valor_viagem);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Viagem other = (Viagem) obj;
		return id_viagem == other.id_viagem && Objects.equals(nome_viagem, other.nome_viagem)
				&& Double.doubleToLongBits(numero_viagem) == Double.doubleToLongBits(other.numero_viagem)
				&& Double.doubleToLongBits(valor_viagem) == Double.doubleToLongBits(other.valor_viagem);
	}

	public String getNome_viagem() {
		return nome_viagem;
	}

	public void setNome_viagem(String nome_viagem) {
		this.nome_viagem = nome_viagem;
	}

	public double getValor_viagem() {
		return valor_viagem;
	}

	public void setValor_viagem(double valor_viagem) {
		this.valor_viagem = valor_viagem;
	}

	public double getNumero_viagem() {
		return numero_viagem;
	}

	public void setNumero_viagem(double numero_viagem) {
		this.numero_viagem = numero_viagem;
	}
	
	
}
