package Locação;

public class Sistema {
	
public static void main(String[] args) {
		
		
		Veiculo meuVeiculo = new VeiculoPasseio();
		
		Pessoa meuProprietario = new Pessoa();
		meuProprietario.setNome("Helena");
		meuVeiculo.setMarca("Honda");
		meuVeiculo.setModelo("Civic");
		meuVeiculo.setPlaca("HJA-1015");
		meuVeiculo.setAno(2016);
		meuVeiculo.setKmFinal(800.35);
		meuVeiculo.setKmInicial(6.00);
		meuVeiculo.setChassi("1077svh200yhk7095");
		meuVeiculo.setProprietario(meuProprietario);
		
		
		System.out.println(meuVeiculo.getMarca());
		System.out.println(meuVeiculo.getModelo());
		System.out.println(meuVeiculo.getAno());
		System.out.println(meuVeiculo.getChassi());
		System.out.println(meuVeiculo.getPlaca());
		System.out.println(meuVeiculo.getKmFinal());
		System.out.println(meuVeiculo.getKmInicial());
					

	}

}
