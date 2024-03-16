import java.math.BigDecimal;

public class Produto{
    
    String nome;
    int quantidade;
    double preco;
    
    public Produto(String nome, int quantidade, double preco){
        setNome(nome);
        setQuantidade(quantidade);
        setPreco(preco);
    }
    
    private void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    private void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    private void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return preco;
    }
}