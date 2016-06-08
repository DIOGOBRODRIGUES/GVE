package br.ufrpe.sistema_vendas_estoques.negocios;

import br.ufrpe.sistema_vendas_estoques.negocios.beans.Cliente;
import br.ufrpe.sistema_vendas_estoques.negocios.beans.Produto;
import br.ufrpe.sistema_vendas_estoques.negocios.beans.Vendas;

public interface IGVE {

	void CadastroCliente(Cliente c);

	void RemoverCliente(String cpf);

	void ProcurarCliente(String cpf);

	void CadastroProduto(Produto p);

	void RemoverProduto(int cod);

	void ProcurarProduto(int cod);

	void AdicionarVenda(Vendas v);

}