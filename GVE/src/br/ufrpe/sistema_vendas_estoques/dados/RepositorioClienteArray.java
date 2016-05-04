package br.ufrpe.sistema_vendas_estoques.dados;


import br.ufrpe.sistema_vendas_estoques.negocios.beans.Cliente;


public class RepositorioClienteArray {
	
	private Cliente[] cliente;
	private int proxima;
	
	public RepositorioClienteArray(int tamanho){
		this.cliente = new Cliente[tamanho];
		this.proxima=0;
	}
	
	public void cadastrar(Cliente c){
		this.cliente[this.proxima]=c;
		this.proxima=this.proxima+1;
	}
	
	public Cliente procurar(String cpf){
		int i =0;
		boolean achou = false;
		while((!achou)&&(i<this.proxima)){
			if(cpf.equals(this.cliente[i].getCpf())){
				achou=true;
			}else{
				i=i+1;
			}
			
		}
		//so um teste
		Cliente resultado =null;
		if(i!=this.proxima){
			resultado=this.cliente[i];
		}
		return resultado;
	}
		
	}
	
	/*public void remover (String cpf){
		int i = 0;
		boolean achou= false;
		while((!achou)&&(i<this.proxima)){
			if(cpf.equals(this.cliente))
		}*/
	



