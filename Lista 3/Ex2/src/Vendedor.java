public class Vendedor extends Empregado {
    private Double valorVendas;
    private int qtdVendas; 
    public Vendedor(){
        
    }
    public void setValorVendas(Double valorVendas){
        this.valorVendas = valorVendas;
    }

    public Double getValorVendas(){
        return this.valorVendas;
    }

    public void setQtdVendas(int qtdVendas){
        this.qtdVendas = qtdVendas;
    }
    public int getQtdVendas(){
        return this.qtdVendas;
    }
    public String toString(){
        return "\nNome: " + super.nome + "\nSalario: " + super.getSalario() + "\nValor das vendas: " + this.valorVendas + "\nQuantidade de vendas: " + this.qtdVendas;
    }
}
