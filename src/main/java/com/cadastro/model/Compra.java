package com.cadastro.model;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table(name = "compra", schema = "agencia")
@Data
public class Compra {

	@Id
	@Column(name = "id_compra")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_compra;
	
	@Column(name = "data_compra")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date data_compra;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "id_viagem")
	private Viagem viagem;

	@Override
	public int hashCode() {
		return Objects.hash(cliente, data_compra, id_compra, viagem);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compra other = (Compra) obj;
		return Objects.equals(cliente, other.cliente) && Objects.equals(data_compra, other.data_compra)
				 && id_compra == other.id_compra 
				&& Objects.equals(viagem, other.viagem);
	}

	

}
