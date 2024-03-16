import java.util.ArrayList;
import java.math.BigDecimal;

public class Compra{
    
    private ArrayList<Produto> produtos;
    private double valorCompra;
    private double valorItem;
    
    public Compra(){
        produtos = new ArrayList<>();
    }
    
    public void adicionaProduto(String nome, int quantidade, double preco){
        produtos.add(nome, quantidade, preco);
    }
    
    public double valorCompra(){
        for(Produto produto: produtos){
            valorItem = produto.getQuantidade() * produto.getPreco();
            valorCompra += valorItem;
        }
        return valorCompra;
    }
}