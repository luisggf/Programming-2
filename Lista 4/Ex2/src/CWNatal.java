public class CWNatal extends CartaoWeb{
 
    public CWNatal(String nome){
        nome = super.getDest();
    }
    public void showMessage(){

        System.out.println("Cartão de natal!! Parábens " + super.getDest() + " espero que aproveite muito essa data!");
    }
}
