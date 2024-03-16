package br.com.sistema.locadora.models;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Produto {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String tituloSerie;
	private String genero;
	private Integer anoLancamento;
	private String avaliacao;
	private BigDecimal valorAluguel;
	private String duracao;
	private Integer numeroTemporadas;
	
}
