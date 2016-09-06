package Memoria;

public class Conexao {

	private static Conexao localInstancia;

	private Conexao() {
		
	}

	public static synchronized Conexao getInstancia() {
		if (localInstancia == null){
			localInstancia = new Conexao();
			System.out.println("Criada conexão: " + localInstancia);}
		else
			System.out.println("Já existe uma conexao: "+localInstancia);

		return localInstancia;
	}
	
}
