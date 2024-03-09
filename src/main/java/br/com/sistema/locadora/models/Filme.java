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
public class Filme {
	@Id
	@GeneratedValue
	private Long id;
	
	private String tituloFilme;
	private String genero;
	private Integer anoLancamento;
	private String avaliacao;
	private String duracao;
	private BigDecimal valorAluguel;
	
}
