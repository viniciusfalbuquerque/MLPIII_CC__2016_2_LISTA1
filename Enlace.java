package Memoria;

import java.util.Scanner;

public class Enlace {
	
   public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String operar="";
		
		while (operar != "0"){
		System.out.println(" -- Banco de Dados --- ");
		System.out.println(" -  1.Criar conex�o  - ");
		System.out.println(" -  0.Sair           - " );
		System.out.println(" --------------------- " );
		System.out.println(" Por favor informe sua op��o: ");
		operar = ler.next();
		
		switch (operar){
		
		case "1":
		// Cria conex�o 
		Conexao minhaConexao = Conexao.getInstancia(); 
		break;
	
		case "0":
			operar = "0";
			break;
			
		default:
		
			System.out.println("Voc� n�o selecionou uma Opcao inv�lida!!!");
		
	  }
		
	 }
	}
	
	
	

}
