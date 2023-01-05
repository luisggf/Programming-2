public class Cliente extends Empregado {
    private Double valorDiv;
    private int anoNasc;

    /**
     * @return Double return the valorDiv
     */
    public Double getValorDiv() {
        return valorDiv;
    }

    /**
     * @param valorDiv the valorDiv to set
     */
    public void setValorDiv(Double valorDiv) {
        this.valorDiv = valorDiv;
    }

    /**
     * @return int return the anoNasc
     */
    public int getAnoNasc() {
        return anoNasc;
    }

    /**
     * @param anoNasc the anoNasc to set
     */
    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public String toString(){
        return "Nome: "+ super.nome + "\nIdade: " + super.idade + "\nSexo: " + super.sexo + "\nValor da dívida: " + this.valorDiv + "\nAno de Nascimento: " + this.anoNasc;
    }

}
