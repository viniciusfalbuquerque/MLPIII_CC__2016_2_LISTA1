package Locação;

public class VeiculoPasseio extends Veiculo {
	
	private int QuantidadePortas;
	private boolean arCondicionado;
	public int getQuantidadePortas() {
		return QuantidadePortas;
	}
	public void setQuantidadePortas(int quantidadePortas) {
		QuantidadePortas = quantidadePortas;
	}
	public boolean isArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

}
