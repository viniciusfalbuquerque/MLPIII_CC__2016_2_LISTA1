package Memoria;

public class Conexao {

	private static Conexao localInstancia;

	private Conexao() {
		
	}

	public static synchronized Conexao getInstancia() {
		if (localInstancia == null){
			localInstancia = new Conexao();
			System.out.println("Criada conex�o: " + localInstancia);}
		else
			System.out.println("J� existe uma conexao: "+localInstancia);

		return localInstancia;
	}
	
}
