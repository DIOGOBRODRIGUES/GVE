package br.ufrpe.sistema_vendas_estoques.dados;

import br.ufrpe.sistema_vendas_estoques.negocios.beans.Cliente;

public interface IRepositorioClienteArrey {

	void cadastrar(Cliente c);

	Cliente procurar(String cpf);

	void remover(String cpf);

}