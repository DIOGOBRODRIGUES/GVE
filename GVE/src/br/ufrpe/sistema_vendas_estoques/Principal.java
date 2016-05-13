package br.ufrpe.sistema_vendas_estoques;

import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import br.ufrpe.sistema_vendas_estoque.gui.TelaTextual;

public class Principal {
	
	
	public static void main(String[] args){
		int menuOpcao;
		TelaTextual tt = new TelaTextual();
		tt.executar();
		Scanner ler = new Scanner(System.in);
		menuOpcao=ler.nextInt();
		switch (menuOpcao) {
		case 1:
			tt.menuCliente();			
			break;
		default:
			break;
		}
	}
	
	
}

