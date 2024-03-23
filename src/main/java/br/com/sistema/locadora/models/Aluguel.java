package br.com.sistema.locadora.models;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Aluguel {

	@Id
	@GeneratedValue
	private Long id;

	@OneToOne
	private Cliente cliente;

	@OneToOne
	private Produto produto;
	private Integer qtdSemanas;
	private BigDecimal valorFinal;

}
