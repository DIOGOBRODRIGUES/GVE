package br.ufrpe.sistema_vendas_estoques;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainGVE extends Application {
	private Stage primaryStage;
	private BorderPane telaRaiz;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("GVE");
		
		iniTelaRaiz();
		
	}
	public void iniTelaRaiz(){
		try{
			FXMLLoader loader = new FXMLLoader ();
			loader.setLocation(MainGVE.class.getResource("gui/TelaRaiz.fxml"));
	        telaRaiz= (BorderPane) loader.load();
	        
	        Scene scene = new Scene (telaRaiz);
	        primaryStage.setScene(scene);
	        primaryStage.show();
		}catch (IOException e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
