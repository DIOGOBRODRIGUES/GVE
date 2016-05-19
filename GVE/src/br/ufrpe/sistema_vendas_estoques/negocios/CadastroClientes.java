package br.ufrpe.sistema_vendas_estoques.negocios;

import br.ufrpe.sistema_vendas_estoques.dados.IRepositorioClienteArrey;
import br.ufrpe.sistema_vendas_estoques.negocios.beans.Cliente;

public class CadastroClientes {

	private IRepositorioClienteArrey repoC;
	
	public void cadastro(Cliente c){
		if(c == null){
			System.out.println("Cliente inexistente!");
		}
		else {
			this.repoC.cadastrar(c);
		}
	}
	public void remover(String cpf){
		this.repoC.remover(cpf);
	}
	
	public Cliente procurar(String cpf){
		return this.repoC.procurar(cpf);
	}
}