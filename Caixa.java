import java.util.ArrayList;
import java.math.BigDecimal;

public class Caixa{
    
    private ArrayList<Produto> produtos;
    private double valorTotal;
    private double valorDesconto;
    private double valorProduto;
    private double lance;
    
    public Caixa(){
        produtos = new ArrayList<>();
    }
    
    public void adicionaProduto(String nome, int quantidade, double preco){
        Produto produto = new Produto(nome, quantidade, preco);
        produtos.add(produto);
    }
    
    public String[] getProduto(int id){
        Produto prod = produtos.get(id);
        return prod.detalhesProduto();
    }
    
    public double valorCompra(){
        valorTotal = 0;
        for(Produto produto: produtos){
            valorProduto = produto.getQuantidade() * produto.getPreco();
            valorTotal += valorProduto;
        }
        return valorTotal;
    }
    
    public void setLance(double lance){
        this.lance = lance;
    }
    
    public double getLance(){
        return lance;
    }
    
    public int verificaLance(){
        if(lance == valorCompra()) return 0;
        int lanceInt = (int)lance;
        int valorCompraInt = (int)valorCompra();
        if(lanceInt == valorCompraInt) return 1;
        return 2;
    }
    
    public double aplicaDesconto(){
        if(verificaLance() == 0) return 0;
        else if(verificaLance() == 1) return valorDesconto =  valorTotal * 0.7;
        return valorTotal;
    }
}