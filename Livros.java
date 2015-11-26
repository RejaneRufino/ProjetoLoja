package loja;

public class Livros extends Itens{

	private String autor;
	
	public Livros(int codigoBarras, String nome, double preco, String autor) {
		super(codigoBarras, nome, preco);
		this.autor = autor;
	}
	
	public String toString(){
		return super.toString() + "\nAutor: " + this.autor;	
	}

}
