public class CWAniversario extends CartaoWeb {

    public CWAniversario(String nome){
        nome = super.getDest();
    }
    public void showMessage(){ 
        System.out.println("Cartão de feliz aniversário!! Desejamos a " + super.getDest() + " tudo de bom!");
    }
    
}
