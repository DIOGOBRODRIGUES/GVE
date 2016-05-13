package br.ufrpe.sistema_vendas_estoques.negocios.beans;

public class Produto {

	private int codigo;
	private String categoria;
	private double preco;
	
		public Produto(int codigo, String categoria, double preco) {
		this.codigo = codigo;
		this.categoria = categoria;
		this.preco = preco;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", categoria=" + categoria + ", preco=" + preco + "]";
	}
	
}
