package Locadora;

public class FitaLancamento extends Fita {

	public void setPrecoDeLocacao(double precoDeLocacao){
		this.precoDeLocacao = precoDeLocacao + precoDeLocacao * 0.20;
	} 

	public double getPrecoDeLocacao(){
		return this.precoDeLocacao;
	}
	
}
