package Sistema;

public class SistemaControle {
	
	public static void main(String [] args){

		Carro NovoCarro = new Carro();
		NovoCarro.setLigar(true);
		NovoCarro.setCor("Amarelo");
		NovoCarro.setVelocidadeAtual(630);
		NovoCarro.setVelocidadeMaxima(300);
		NovoCarro.setModelo("Ferrari Enzo");
		NovoCarro.acelerar(NovoCarro.getVelocidadeAtual(),80);
		System.out.println("A velocidade atual é " + NovoCarro.getVelocidadeAtual() + "Km/h." + " E a velocidade máxima permitida é " +  NovoCarro.getVelocidadeMaxima() + "Km/h" );
		

	}
	

}
