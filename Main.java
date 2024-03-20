/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
        
        String[] detalhes;
        
		Caixa caixa = new Caixa();
		
		caixa.adicionaProduto("Produto1", 1, 10.0);
		System.out.println("Qtd. \t\t Nome \t\t\t Preco");
		detalhes = caixa.getProduto(0);
		for(String informacao: detalhes){
		    System.out.print(informacao + " \t\t ");
		}
		
		caixa.adicionaProduto("Produto2", 4, 5.0);
		System.out.println("\n\nQtd. \t\t Nome \t\t\t Preco");
		detalhes = caixa.getProduto(1);
		for(String informacao: detalhes){
		    System.out.print(informacao + " \t\t ");
		}
		
		System.out.println("\n\nValor Compra: R$" + caixa.valorCompra());
		
        caixa.setLance(40.1);
		System.out.println("\nLance: R$" + caixa.getLance());
		System.out.println("Valor com Desconto: " + caixa.aplicaDesconto());
		
		caixa.setLance(30.1);
		System.out.println("\nLance: R$" + caixa.getLance());
		System.out.println("Valor com Desconto: " + caixa.aplicaDesconto());
		
		caixa.setLance(30.0);
		System.out.println("\nLance: R$" + caixa.getLance());
		System.out.println("Valor com Desconto: " + caixa.aplicaDesconto());
	}
}
