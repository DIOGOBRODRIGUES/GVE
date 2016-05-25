package br.ufrpe.sistema_vendas_estoques.negocios;

import br.ufrpe.sistema_vendas_estoques.dados.IRepositorioProdutosArray;
import br.ufrpe.sistema_vendas_estoques.negocios.beans.Produto;

public class CadastroProduto {

    private IRepositorioProdutosArray repoP;
    
    public void Cadastro (Produto p){
    	
    	if (p==null){
    		System.out.println("Produto não cadastrado!");
    	}else{
    		this.repoP.cadastrar(p);
    	}
    	
    }//fim de cadastrado
    
    public Produto procurar (int cod ){
    	return this.repoP.procurar(cod);
    }
    
    public void remover (int cod){
    	this.repoP.remover(cod);
    }

}
