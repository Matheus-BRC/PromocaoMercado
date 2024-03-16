public class Caixa{
    double lance;
    
    public Caixa(double lance){
        Compra compra = new Compra();
        setLance(lance);
    }
    
    private void setLance(double lance){
        this.lance = lance;
    }
    
    public int verificaLance(){
        if(lance == compra.valorCompra) return 0;
        int lanceInt = (int)lance;
        int valorCompraInt = (int)compra.valorCompra;
        if(lanceInt == valorCompraInt) return 1;
        return 2;
    }
    
    public double aplicaDesconto(){
        if(verificaLance == 0) return 0;
        else if(verificaLance == 1) return valorTotal =  compra.valorCompra * 0.7;
        else return compra.valorCompra;
    }
}