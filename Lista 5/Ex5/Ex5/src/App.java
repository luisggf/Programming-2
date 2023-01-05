import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int x, y;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eu sei dividir!");
        int flag = 0;
        while (flag != 1)

            try {
                System.out.print("Informe o primeiro valor: ");
                // teclado.nextLine();
                x = Integer.parseInt(teclado.nextLine());
                System.out.print("Informe o segundo valor: ");
                // teclado.nextLine();
                y = Integer.parseInt(teclado.nextLine());
                System.out.println("0 resultado da divisao é: " + div(x, y));
                flag = 1;
            } catch (InputMismatchException e) {
                System.out.println("Valor deve ser inteiro!");
            } catch (ArithmeticException e) {
                System.out.println("Denominador nao pode ser 0!");
            } catch (Exception e) {
                System.out.println("Erro inesperado! ");
            }

    }

    public static double div(int x, int y) {
        double r = x / y;
        return r;
    }
}
