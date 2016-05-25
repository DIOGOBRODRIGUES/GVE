package br.ufrpe.sistema_vendas_estoques.dados;

import br.ufrpe.sistema_vendas_estoques.negocios.beans.Vendas;

public interface IRepositorioVendasArray {

	void adicionar(Vendas v);

	Vendas procurar(String data);

}