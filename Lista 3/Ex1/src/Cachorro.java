public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome){
        super(nome);
    }
    

    /**
     * @return String return the raca
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String toString(){
    return "\nNome: " + super.getNome() + "\nPeso: " + super.getPeso() + "\nRaca: " + this.raca;

    }

}
