package br.com.sistema.locadora.exception;

public class LocadoraNotFoundException extends RuntimeException {

	// Identificador de versão - classe Seria
	// Static pois é uma variavel que pode ser acessada de qualquer lugar e final
	// pois a variavel é definida uma unica vez
	private static final long serialVersionUID = 1L;
	
	public LocadoraNotFoundException() {
		super();
	}
	
	public LocadoraNotFoundException(String mensagem){
		super(mensagem);
	}
	

}
