//package br.ufrpe.sistema_vendas_estoques;
//
//import java.io.IOException;
//import java.util.Scanner;
//
//import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;
//
//import com.sun.glass.ui.Application;
//
//import br.ufrpe.sistema_vendas_estoque.gui.TelaTextual;
//import br.ufrpe.sistema_vendas_estoques.dados.IRepositorioClienteArrey;
//import br.ufrpe.sistema_vendas_estoques.negocios.beans.Cliente;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;
//import javafx.stage.Stage;
//
//public class Principal extends Application {
//	
//	private Stage primaryStage;
//	private BorderPane telaRaiz;
//	
//	@Override
//	public void start (Stage primaryStage){
//		this.primaryStage = primaryStage;
//		this.primaryStage.setTitle("GVE");
//		
//		iniTelaRaiz();
//		
//		//showCadastroCliente();
//		
//	}
//	
//	public void iniTelaRaiz(){
//		try{
//			FXMLLoader loader = new FXMLLoader ();
//			loader.setLocation(Principal.class.getResource("gui/TelaRaiz.fxml"));
//	        telaRaiz= (BorderPane) loader.load();
//	        
//	        Scene scene = new Scene (telaRaiz);
//	        primaryStage.setScene(scene);
//	        primaryStage.show();
//		}catch (IOException e){
//			e.printStackTrace();
//		}
//	}
//	
//	
//	public static void main(String[] args){
//		launch(args);
////		int menuOpcao;
////		TelaTextual iniciar = new TelaTextual();
////		iniciar.executar();
////		Scanner ler = new Scanner(System.in);
////		menuOpcao=ler.nextInt();
////		switch (menuOpcao) {
////		case 1:
////			tt.menuCliente();			
////			break;
////		default:
////			break;
////		}
//		
//	
//		
//	}
//	
//	
//}

