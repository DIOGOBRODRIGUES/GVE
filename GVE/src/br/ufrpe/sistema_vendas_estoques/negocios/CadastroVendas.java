package br.ufrpe.sistema_vendas_estoques.negocios;

import br.ufrpe.sistema_vendas_estoques.dados.IRepositorioVendasArray;
import br.ufrpe.sistema_vendas_estoques.negocios.beans.Vendas;

public class CadastroVendas {
	
	private IRepositorioVendasArray repoV;
	
	public void adicionar (Vendas v){
		if (v==null){
			System.out.println("");
		}
		
	}

}
