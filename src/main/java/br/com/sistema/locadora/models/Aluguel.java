package br.com.sistema.locadora.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Aluguel {
	
	@Id
	@GeneratedValue
	private Long id;

	private Cliente cliente;
	private Produto produto;
	private Integer qtdSemanas;
	
}
