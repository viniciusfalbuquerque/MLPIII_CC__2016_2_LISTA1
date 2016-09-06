package Locadora;

public class FitaInfantil extends Fita {

	public void setPrecoDeLocacao(double precoDeLocacao){
		this.precoDeLocacao = precoDeLocacao - precoDeLocacao * 0.40;
	} 

	public double getPrecoDeLocacao(){
		return this.precoDeLocacao;
	}
}
