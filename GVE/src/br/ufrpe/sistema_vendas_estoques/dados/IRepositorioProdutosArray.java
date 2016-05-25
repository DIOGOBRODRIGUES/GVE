package br.ufrpe.sistema_vendas_estoques.dados;

import br.ufrpe.sistema_vendas_estoques.negocios.beans.Produto;

public interface IRepositorioProdutosArray {

	void cadastrar(Produto p);

	Produto procurar(int codigo);

	void remover(int codigo);

}