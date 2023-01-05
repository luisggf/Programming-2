public class Gerente extends Empregado{
    private String nomeGerencia;

    /**
     * @return String return the nomeGerencia
     */
    public String getNomeGerencia() {
        return nomeGerencia;
    }

    /**
     * @param nomeGerencia the nomeGerencia to set
     */
    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }
    public String toString(){
        return "\nNome: " + super.nome + "\nIdade: " + super.idade + "\nSalario: " + super.getSalario() + "\nNome da gerencia: " + this.nomeGerencia + "\nNumero da matricula: " + super.getMatricula() + "\nValor do INSS: " + super.calcINSS();
    }
}
