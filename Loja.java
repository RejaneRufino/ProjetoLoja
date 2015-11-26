
//Rejane Rufino de Sousa Silva
//C353248
//DS3P30

package loja;

import java.util.ArrayList;
import java.util.Scanner;

import loja.CDS;
import loja.DVDS;
import loja.Livros;
import loja.Loja;
import loja.Itens;

public class Loja {
	static int codigoBarras;
		
		public static void main(String[] args) {
			
			
			ArrayList<Itens> itens = new ArrayList<Itens>();
	
			
			CDS cd1 = new CDS(123456, "Só pra contrariar", 20.00, 22);
			DVDS dvd1 = new DVDS(456789, "O leitor", 80.00, "3:00");
			Livros livro1 = new Livros(789456, "Quando o passado não passa", 35.00, "Elisa Marcele");			
			CDS cd2 = new CDS(123456, "Fala mansa", 10.00, 13);		
			DVDS dvd2 = new DVDS(456789, "O leitor", 80.00, "3:00");
			
			itens.add(cd1);
			itens.add(dvd1);
			itens.add(livro1);
			itens.add(cd2);	
			itens.add(dvd2);

			for (Itens item : itens){
				System.out.println(itens.toString());
			}	
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("\nInforme o código de barras do produto: ");
			
			codigoBarras = entrada.nextInt();
			Loja.LocalizaProd(itens, codigoBarras);
			
		}
		
		public static void LocalizaProd(ArrayList<Itens> itens, int codigoBarras)
		{
			for (Itens item : itens){
				if (item.GetCodigoBarras() == codigoBarras){
					System.out.println(itens.toString());
					return;
				}							
			}
			System.out.println("Produto não encontrado.");
		}
}
