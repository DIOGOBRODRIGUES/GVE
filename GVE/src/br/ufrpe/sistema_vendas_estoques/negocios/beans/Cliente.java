
package br.ufrpe.sistema_vendas_estoques.negocios.beans;

public class Cliente{
	private int codigo;
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String telefone;
	private String endereco;
	private String email;
	
	public Cliente(int codigo, String nome, String cpf, String dataNascimento,String telefone, String endereco, String email) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
	
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf
				+ ", dataNascimento=" + dataNascimento + ", telefone="
				+ telefone + ", endereco=" + endereco + ", email=" + email
				+ "]";
	}
	
	/*public static void main(String[] args){
		Cliente c1 = new Cliente("joao", "0123");
		System.out.println(c1);
	}*/


}