package Locadora;

public abstract class Fita {

	protected String titulo;
	protected double precoDeLocacao;
	protected String categoria;
	protected Autor autor;

	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	public void setCategoria(String categoria){
		this.categoria = categoria;
	}

	public void setAutor(Autor autor){
		this.autor = autor;
	}


	public String getTitulo(){
		return this.titulo;
	}

	public String getCategoria(){
		return this.categoria;
	}

	public Autor getAutor(){
		return this.autor;
	}
	
}
