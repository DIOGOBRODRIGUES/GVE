package br.ufrpe.sistema_vendas_estoques.negocios;

import br.ufrpe.sistema_vendas_estoques.negocios.beans.Cliente;

public class ServidorGVE {
	
	private CadastroClientes cliente;
	private CadastroProduto produto;
	private CadastroVendas vendas; 

	public void cadastro(Cliente c) {
		cliente.cadastro(c);
	}

	public void remover(String cpf) {
		cliente.remover(cpf);
	}

	public Cliente procurar(String cpf) {
		return cliente.procurar(cpf);
	}

}
