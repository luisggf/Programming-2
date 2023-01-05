import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Qual o preco do servico de cada maos?");
        float PRECO_MAOS = leitor.nextFloat();
        System.out.printf("Qual o preco do servico de cada pes?");
        float PRECO_PES = leitor.nextFloat();
        System.out.printf("Quantas  manicures trabalham no salao?");
        int NUM_MANICURES = leitor.nextInt();

        for (int i = 0; i < NUM_MANICURES; ++i) {
            System.out.printf("Manicure: %d", (i + 1));
            System.out.printf("Qtde de maos feitas pela manicure: %d", (i + 1));
            int qtdMaos = leitor.nextInt();
            System.out.printf("Qtde de pes feitas pela manicure: %d", (i + 1));
            int qtdPes = leitor.nextInt();
            float valorReceber = (PRECO_MAOS * qtdMaos + PRECO_PES * qtdPes) * 0.5;
            System.out.printf("Valor a receber pela Manicure %d: ", (i + 1), valorReceber);
        }
    }
}
