package br.ufrpe.sistema_vendas_estoques.exceptions;

public class ClienteInexistenteException extends Exception{

	private String cpf;
	
	public ClienteInexistenteException(String cpf){
		super("O cliente cujo cpf eh: "+ cpf +" não existe.");
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	
}
