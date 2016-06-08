package br.ufrpe.sistema_vendas_estoques.negocios;


import br.ufrpe.sistema_vendas_estoques.negocios.beans.Cliente;
import br.ufrpe.sistema_vendas_estoques.negocios.beans.Produto;
import br.ufrpe.sistema_vendas_estoques.negocios.beans.Vendas;

public class FachadaGVE implements IGVE {
	
	private CadastroClientes cliente;
	private CadastroProduto produto;
	private CadastroVendas venda;
	
	private static IGVE instance;
	
	private FachadaGVE(){
		this.cliente = new CadastroClientes();
		this.produto = new CadastroProduto();
		this.venda = new CadastroVendas();
		
	}
	
	 /**
	   * Implementando padrão Singleton
	   * 
	   * @return A instância da desta fachada
	   */
	  public static IGVE getInstance() {
	    if (instance == null) {
	      instance = new FachadaGVE();
	    }
	    return instance;
	  }
	
	/* (non-Javadoc)
	 * @see br.ufrpe.sistema_vendas_estoques.negocios.IGVE#CadastroCliente(br.ufrpe.sistema_vendas_estoques.negocios.beans.Cliente)
	 */
	@Override
	public void CadastroCliente (Cliente c){
		this.cliente.cadastro(c);
	}
	
	/* (non-Javadoc)
	 * @see br.ufrpe.sistema_vendas_estoques.negocios.IGVE#RemoverCliente(java.lang.String)
	 */
	@Override
	public void RemoverCliente (String cpf){
		this.cliente.remover(cpf);
	}
	
	/* (non-Javadoc)
	 * @see br.ufrpe.sistema_vendas_estoques.negocios.IGVE#ProcurarCliente(java.lang.String)
	 */
	@Override
	public void ProcurarCliente(String cpf){
		this.cliente.procurar(cpf);
	}
	
	/* (non-Javadoc)
	 * @see br.ufrpe.sistema_vendas_estoques.negocios.IGVE#CadastroProduto(br.ufrpe.sistema_vendas_estoques.negocios.beans.Produto)
	 */
	@Override
	public void CadastroProduto(Produto p){
		this.produto.Cadastro(p);
	}
	
	/* (non-Javadoc)
	 * @see br.ufrpe.sistema_vendas_estoques.negocios.IGVE#RemoverProduto(int)
	 */
	@Override
	public void RemoverProduto(int cod){
		this.produto.remover(cod);
	}
	
	/* (non-Javadoc)
	 * @see br.ufrpe.sistema_vendas_estoques.negocios.IGVE#ProcurarProduto(int)
	 */
	@Override
	public void ProcurarProduto(int cod){
		this.produto.procurar(cod);
	}
	
	/* (non-Javadoc)
	 * @see br.ufrpe.sistema_vendas_estoques.negocios.IGVE#AdicionarVenda(br.ufrpe.sistema_vendas_estoques.negocios.beans.Vendas)
	 */
	@Override
	public void AdicionarVenda(Vendas v){
		this.venda.adicionar(v);
	}
	
	

}
