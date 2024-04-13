package br.com.sistema.locadora.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Cliente {
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	private String email;
	private String password;
	private String nivelPermissao;
	private Date dataNascimento;
	
}
