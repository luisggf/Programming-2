public class Peixe extends Animal{
    private String Habitat;
    
    public Peixe(String nome){
        super(nome);
    }
    public void setHabitat (String Habitat){
        this.Habitat = Habitat;
    }
    public String getHabitat(){
        return this.Habitat;
    }

    public String toString(){
        return "\nNome: " + super.getNome() + "\nPeso: " + super.getPeso() + "\nHabitat: " + this.Habitat;
    }

    // private String 

}
