package Locadora;

public class Sistema {
	
	 public static void main(String [] args){
	        
	       FitaInfantil FitaAtual = new FitaInfantil(); 
	       FitaAtual.setTitulo("Carga Explosiva");
	       FitaAtual.setCategoria("A��o");
	       FitaAtual.setPrecoDeLocacao(25.00);
	        
	        System.out.println("O filme locado �: " +  FitaAtual.getTitulo() + ". Categoria: " + FitaAtual.getCategoria() + ". Pre�o: " + FitaAtual.getPrecoDeLocacao());
	        
	    }

}
