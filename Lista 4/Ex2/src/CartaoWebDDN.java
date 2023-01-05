public class CartaoWebDDN extends CartaoWeb {

    public CartaoWebDDN(String nome){
        nome = super.getDest();
    }
    public void showMessage(){
        System.out.println("Cartão de dia dos namorados!! Saiba que " + super.getDest() + " é muito especial para mim!");
    }

    
}
