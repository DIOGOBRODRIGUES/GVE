package br.ufrpe.sistema_vendas_estoques.dados;


import br.ufrpe.sistema_vendas_estoques.exceptions.ClienteInexistenteException;
import br.ufrpe.sistema_vendas_estoques.negocios.beans.Cliente;


public class RepositorioClienteArray implements IRepositorioClienteArrey {
	
	private Cliente[] cliente;
	private int proxima;
	
	public RepositorioClienteArray(int tamanho){
		this.cliente = new Cliente[tamanho];
		this.proxima=0;
	}
	
	/* (non-Javadoc)
	 * @see br.ufrpe.sistema_vendas_estoques.dados.IRepositorioClienteArrey#cadastrar(br.ufrpe.sistema_vendas_estoques.negocios.beans.Cliente)
	 */
	@Override
	public void cadastrar(Cliente c){
		this.cliente[this.proxima]=c;
		this.proxima=this.proxima+1;
		System.out.println("Cliente "+c+"cadastrado");
	}
	
	/* (non-Javadoc)
	 * @see br.ufrpe.sistema_vendas_estoques.dados.IRepositorioClienteArrey#procurar(java.lang.String)
	 */
	@Override
	public Cliente procurar(String cpf){
		int i = this.procurarIndice(cpf);
		Cliente resultado = null;
		if(i!=this.proxima){
			resultado=this.cliente[i];
		}
		return resultado;
	}
		
	
	
	/* (non-Javadoc)
	 * @see br.ufrpe.sistema_vendas_estoques.dados.IRepositorioClienteArrey#remover(java.lang.String)
	 */
	@Override
	public void remover (String cpf)throws ClienteInexistenteException{
		int i = this.procurarIndice(cpf);
		if(i!=this.proxima){
			this.cliente[i]=this.cliente[this.proxima-1];
			this.cliente[this.proxima-1]=null;
			this.proxima=this.proxima-1;
			System.out.println("Cliente"+cpf +"removida");
		}else{
			throw new ClienteInexistenteException(cpf);
		}

	} 
	
	private int procurarIndice(String cpf){
		int i =0;
		boolean achou = false;
		while((!achou)&&(i<this.proxima)){
			if(cpf.equals(this.cliente[i].getCpf())){
				achou=true;
			}else{
				i=i+1;
			}
		}
		return i;
	}
}
	
	



