
public class Fatura {

	private String numero;
	private String descricao;
	private int quantidade;    
	private double preco;    

	
		public String getNumero(){
			return this.numero;
		}

		public String getDescricao(){
			return this.descricao;
		}

		public int getQuantidade(){
			return this.quantidade;
		}

		public double getPreco(){
			return this.preco;
		}

		public void setNumero(String numero){
			this.numero = numero;
		}

		public void setDescricao(String descricao){
			this.descricao = descricao;
		}

		public void setQuantidade(int quantidade){
			this.quantidade = quantidade;
		}

		public void setPreco(double preco){
			if(preco<0){
				this.preco = 0;
			}
			this.preco = preco;
		}

		public double getValorFatura(){
			double valor = this.preco*this.quantidade;
			if(valor<0){
				valor = 0;
			}
			
			return valor;
		}


	
}
