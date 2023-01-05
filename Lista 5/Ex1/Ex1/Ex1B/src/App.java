
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int flag = 0, number;
        Scanner scan = new Scanner(System.in);
        Set<Produtos> produtos = new HashSet<Produtos>();
        while (flag == 0) {
            System.out.println("\nDigite (1) para adicionar produto: \nDigite (2) para sair: \n");
            number = scan.nextInt();
            if (number == 1) {
                Produtos p = new Produtos(scan.next(), scan.next(), scan.nextInt());
                if (produtos.contains(p)) {
                    System.out.println("Produto ja existente");
                } else {
                    produtos.add(p);
                }
            }
            if (number == 2) {
                flag = 1;
            }
            System.out.println(produtos);
        }
    }
}