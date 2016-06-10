package br.ufrpe.sistema_vendas_estoques.gui;

import java.util.Scanner;

import br.ufrpe.sistema_vendas_estoques.negocios.FachadaGVE;
import br.ufrpe.sistema_vendas_estoques.negocios.IGVE;
import br.ufrpe.sistema_vendas_estoques.negocios.beans.Cliente;

public class TelaTextual {
	
	public void executar(){

		System.out.println("*********************GVE****************");
		System.out.println(" Sistema de controle de estoque");
		System.out.println("*****************************************");
		System.out.println("1-Clientes");
		System.out.println("2-Vendas");
		
		
		int opcao;
		Scanner ler = new Scanner(System.in);
		opcao = ler.nextInt() ;
		switch (opcao) {
		case 1:
			menuCliente();
			break;

		default:
			break;
		}
	}
	
	public void menuCliente(){
		System.out.println();
		System.out.println("*********************GVE****************");
		System.out.println("1-cadastrar");
		System.out.println("2-remover");
		System.out.println("3-Procurar");
		System.out.println("4-Voltar");
		
		int opcao;
		Scanner ler = new Scanner(System.in);
		opcao=ler.nextInt();
        switch (opcao) {
		case 1:
			formularioCliente();
			break;

		default:
			break;
		}
	}

	private void formularioCliente() {
		IGVE fachada = FachadaGVE.getInstance();
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite codigo:");
		int id= ler.nextInt();
		System.out.println("nome: ");
		String nome = ler.next();
		System.out.println("CPF: ");
		String cpf = ler.next();
		System.out.println("Data Nascimento: ");
		String dataNasc = ler.next();
		System.out.println("Telefone: ");
		String fone = ler.next();
		System.out.println("Endereco: ");
		String endereco = ler.next();
		System.out.println("Email: ");
		String email= ler.nextLine();
		
		Cliente c = new Cliente (id, nome, cpf, dataNasc, fone, endereco, email);
		fachada.CadastroCliente(c);
		
		
		
		
	}

}
