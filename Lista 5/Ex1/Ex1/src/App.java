import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class App {
    public static void main(String[] args) {
        int flag = 0, string;
        Set<String> names = new HashSet<String>();
        try (Scanner sc = new Scanner(System.in)) {
            while (flag == 0) {
                System.out.println("\nDigite (1) caso deseja adicionar um nome: \nDigite (2) caso deseje remover um nome: \nDigite (3) caso deseje apagar todos names: \nDigite (4) caso deseje sair: \n\n");
                string = sc.nextInt();
                if (string == 1) {
                    System.out.print("Digite o nome: ");
                    names.add(sc.next());
                }
                if (string == 2) {
                    System.out.print("Digite o nome a ser removido: ");
                    names.remove(sc.next());
                }
                if (string == 3) {
                    System.out.print("Limpando lista!\n");
                    names.clear();
                }
                if (string == 4) {
                    System.out.print("Programa sera encerrado!");
                    flag = 1;
                }
                System.out.println(names);
            }
        }
    }
}
