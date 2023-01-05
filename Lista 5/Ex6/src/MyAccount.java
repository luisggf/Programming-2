public class MyAccount {
    private Double accTotal;
    public MyAccount(Double valorDaConta){
        this.accTotal = valorDaConta;
    }
    public Double deposita(Double value){
        if(value < 0)
            throw new RuntimeException("Valor de deposito deve ser positivo!");
        Double newValue = this.accTotal + value;

        this.accTotal = value + this.accTotal;
        return newValue;
    }
    public Double saca(Double value){
        if(this.accTotal - value < 0)
            throw new RuntimeException("Valor de saque superior a saldo da conta! Operacao invalida!");
        else if(value < 0)
            throw new RuntimeException("Valor de saque deve ser positivo!");
        this.accTotal = this.accTotal - value;
        return this.accTotal;
    }

    public void printValue(Double value){
        System.out.println("Valor total da conta: " + this.accTotal);
    }

}
