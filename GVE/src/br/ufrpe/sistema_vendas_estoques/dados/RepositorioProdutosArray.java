package br.ufrpe.sistema_vendas_estoques.dados;

import br.ufrpe.sistema_vendas_estoques.negocios.beans.Produto;

public class RepositorioProdutosArray {
	
	private Produto[] produto;
	private int proxima;
	
	public RepositorioProdutosArray(int tamanho){
		this.produto = new Produto[tamanho];
		this.proxima=0;
	}
	
	public void cadastrar(Produto p){
		this.produto[this.proxima]=p;
		this.proxima=this.proxima+1;
	}
	
	public Produto procurar(int codigo){
		int i = this.procurarIndice(codigo);
		Produto resultado = null;
		if(i!=this.proxima){
			resultado=this.produto[i];
		}
		return resultado;
	}
		
	
	
	public void remover (int codigo){
		int i = this.procurarIndice(codigo);
		if(i!=this.proxima){
			this.produto[i]=this.produto[this.proxima-1];
			this.produto[this.proxima-1]=null;
			this.proxima=this.proxima-1;
			System.out.println("Produto"+codigo +"removido");
		}else{
			System.out.println("Produto não existente");
		}

	}
	
	private int procurarIndice(int codigo){
		int i =0;
		boolean achou = false;
		while((!achou)&&(i<this.proxima)){
			if(codigo==(this.produto[i].getCodigo())){
				achou=true;
			}else{
				i=i+1;
			}
		}
		return i;
	}
}