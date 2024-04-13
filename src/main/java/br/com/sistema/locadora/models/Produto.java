package br.com.sistema.locadora.models;


import jakarta.persistence.Column;
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
	
	private String titulo;
	private String genero;
	private Integer anoLancamento;
	@Column(length = 1250)
	private String description;
	private String duracao;
	@Column(length = 12500)
	private String capa;
	
}
