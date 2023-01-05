// impede a criacao de certas classes
public abstract class Animal {
    private String nome;
    private float peso;

    public Animal(String nome){
        setNome(nome);
        
    }
    public void setNome(String nome){
        this.nome = nome;    
    }
    public String getNome(){
        return this.nome;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    public float getPeso(){
        return this.peso;
    }
    // public abstract void oi();
    
    

}