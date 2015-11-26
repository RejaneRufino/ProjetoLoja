package loja;

public class CDS extends Itens {
	private int num_Faixas = 0;
	
	public CDS(int codigoBarras, String nome, double preco, int num_Faixas) {
		super(codigoBarras, nome, preco);
		this.num_Faixas = num_Faixas;
	}


	//Sobrescrita do metodo toString
	public String toString(){
		return super.toString() + "\nNúmero de faixas: " + this.num_Faixas;	
	}
}
