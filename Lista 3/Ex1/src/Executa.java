import java.util.Scanner;

public class Executa {
    public static void main(String[] args) {

        Cachorro c1 = new Cachorro("Teobaldo");
        c1.setPeso(45);    
        System.out.printf("Peso: %.2f \nNome: %s\n", c1.getPeso(), c1.getNome());

        Peixe p1 = new Peixe("Lambari");
        p1.setPeso(10);

        System.out.printf("Peso: %.2f \nNome: %s\n", p1.getPeso(), p1.getNome());
        p1.setHabitat("Terra");
        System.out.println(p1);

        c1.setRaca("Cheetos");
        System.out.println(c1);

    }
}
