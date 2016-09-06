
public class LojadeSuprimentosInformatica {

	
	public static void main(String[] args){


		Fatura FaturaAtual = new Fatura(); 

		FaturaAtual.setNumero("10451000");
		FaturaAtual.setDescricao("Micro Processador");
		FaturaAtual.setQuantidade(10);
		FaturaAtual.setPreco(800.00);
                System.out.println("O numero da sua fatura é: " + FaturaAtual.getNumero());

	}
	
}
