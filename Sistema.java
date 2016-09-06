package Locadora;

public class Sistema {
	
	 public static void main(String [] args){
	        
	       FitaInfantil FitaAtual = new FitaInfantil(); 
	       FitaAtual.setTitulo("Carga Explosiva");
	       FitaAtual.setCategoria("Ação");
	       FitaAtual.setPrecoDeLocacao(25.00);
	        
	        System.out.println("O filme locado é: " +  FitaAtual.getTitulo() + ". Categoria: " + FitaAtual.getCategoria() + ". Preço: " + FitaAtual.getPrecoDeLocacao());
	        
	    }

}
