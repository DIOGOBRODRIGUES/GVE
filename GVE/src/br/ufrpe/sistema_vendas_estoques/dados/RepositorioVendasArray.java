package br.ufrpe.sistema_vendas_estoques.dados;

import br.ufrpe.sistema_vendas_estoques.negocios.beans.Vendas;

public class RepositorioVendasArray implements IRepositorioVendasArray {
     
	private Vendas[] venda;
	private int proxima;
	
	public RepositorioVendasArray(int tamanho){
		this.venda = new Vendas[tamanho];
		this.proxima=0;
	}
	
	/* (non-Javadoc)
	 * @see br.ufrpe.sistema_vendas_estoques.dados.IRepositorioVendasArray#adicionar(br.ufrpe.sistema_vendas_estoques.negocios.beans.Vendas)
	 */
	@Override
	public void adicionar(Vendas v){
		this.venda[this.proxima]=v;
		this.proxima=this.proxima+1;
	}
	
	/* (non-Javadoc)
	 * @see br.ufrpe.sistema_vendas_estoques.dados.IRepositorioVendasArray#procurar(java.lang.String)
	 */
	@Override
	public Vendas procurar(String data){
		int i = this.procurarIndice(data);
		Vendas resultado = null;
		if(i!=this.proxima){
			resultado=this.venda[i];
		}
		return resultado;
	}
	

	
	private int procurarIndice(String data){
		int i =0;
		boolean achou = false;
		while((!achou)&&(i<this.proxima)){
			if(data.equals((this.venda[i].getDataHora()))){
				achou=true;
			}else{
				i=i+1;
			}
		}
		return i;
	}
}
