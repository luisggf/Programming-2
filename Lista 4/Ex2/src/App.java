public class App {
    public static void main(String[] args) throws Exception {
        CartaoWeb Cartoes[] = new CartaoWeb[3];
        Cartoes[0] = new CartaoWebDDN("Ana Julia");
        Cartoes[0].setDest("Ana Julia");
        Cartoes[1] = new CWNatal("George");
        Cartoes[1].setDest("George");
        Cartoes[2] = new CWAniversario("Alice");
        Cartoes[2].setDest("Alice");
        
        for(int i = 0; i < 3; i++){
            Cartoes[i].showMessage();   
        }
    }
}
