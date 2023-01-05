import java.util.Scanner;

import javafx.beans.binding.ObjectExpression;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double saldo, deposito, saque;
        System.out.print("Digite seu saldo: ");
        saldo = scan.nextDouble();
        // Object ex = new Object();
        MyAccount ac1 = new MyAccount(saldo);

        try {
            System.out.print("Digite o valor do deposito: ");
            deposito = scan.nextDouble();
            ac1.deposita(deposito);
            ac1.printValue(saldo);
            System.out.print("Digite o valor do saque: ");
            saque = scan.nextDouble();
            ac1.saca(saque);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            // e.printStackTrace();
        }
        ac1.printValue(saldo);

    }
}
