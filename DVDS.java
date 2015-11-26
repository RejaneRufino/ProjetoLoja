package loja;

public class DVDS extends Itens{

	private String duracao; 
	
	public DVDS(int codigoBarras, String nome, double preco, String duracao) {
		super(codigoBarras, nome, preco);
		this.duracao = duracao;
	}
	
	public String toString(){
		return super.toString() + "\nDuração: " + this.duracao;	
	}
}
