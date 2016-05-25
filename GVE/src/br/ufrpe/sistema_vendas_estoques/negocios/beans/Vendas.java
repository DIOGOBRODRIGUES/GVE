package br.ufrpe.sistema_vendas_estoques.negocios.beans;

public class Vendas {
	Cliente cliente;
	Produto[] produto;
	private String DataHora;
	
	public String getDataHora() {
		return DataHora;
	}
	public void setDataHora(String dataHora) {
		DataHora = dataHora;
	}

}
