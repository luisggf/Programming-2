import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<Workers> a1 = new ArrayList<Workers>();
        Scanner sc1 = new Scanner(System.in);
        // Map<String> mapa = new HashMap<String>();
        int flag = 0;
        int selection;
        String name;
        String codigo;
        Double salary;
        String AdmissionDate;

        while (flag != 1) {
            System.out.println(
                    "Digite (1) para adicionar funcionario: \nDigite (2) para mostrar funcionario mais antigo: \nDigite (4) para mostrar funcionario com maior salario: \n");
            selection = sc1.nextInt();
            int i = 0;
            i++;
            // try {
                if (selection == 1) {

                    sc1.nextLine();
                    System.out.println("Digite um nome: ");
                    name = sc1.nextLine();
                    sc1.nextLine();
                    System.out.println("Digite um codigo: ");
                    codigo = sc1.nextLine();
                    sc1.nextLine();
                    System.out.println("Digite um salario: ");
                    salary = sc1.nextDouble();
                    sc1.nextLine();
                    System.out.println("Digite uma data: ");
                    AdmissionDate = sc1.nextLine();
                    sc1.nextLine();

                    Workers wi = new Workers(name, codigo, salary, AdmissionDate);
                    a1.add(wi);
                    Collections.sort(a1);

                } else if (selection == 2) {
                    System.out.println(a1);
                } else if (selection == 3) {
                    Collections.max(a1);

                }

            // } catch (Exception e) {
            //     System.out.println("Nao foi possivel efetuar operacao!\n\n");
            // }
            System.out.println(a1);
        }

    }

}
