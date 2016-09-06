package Sistema;

public class Carro {
	
	private boolean ligar;
	private String cor;
	private String modelo;
	private double velocidadeAtual;
	private double velocidadeMaxima;



	public String getCor(){
		return this.cor;
	}

	public String getModelo(){
		return this.modelo;
	}

	public double getVelocidadeAtual(){
		return this.velocidadeAtual;
	}

	public double getVelocidadeMaxima(){
		return this.velocidadeMaxima;
	}

	public boolean getLigar(){
		return this.ligar;
	}


	public void setCor(String cor){
		this.cor = cor;
	}

	public void setModelo(String modelo){
		this.modelo = modelo;
	}

	public void setVelocidadeAtual(double velocidadeAtual){
		this.velocidadeAtual = velocidadeAtual;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima){
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void setLigar(boolean ligar){
		this.ligar = ligar;
	}

	
	public void acelerar(double velocidadeAtual, double velocidadeAcrescentada){
		this.velocidadeAtual = this.velocidadeAtual + velocidadeAcrescentada;

		if(velocidadeAtual > velocidadeMaxima){
			System.out.println("A velocidade foi excedida!!!!!!");
		}
	}
	

}
