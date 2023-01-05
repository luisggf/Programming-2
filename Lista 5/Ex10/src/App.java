import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Calculator c1 = new Calculator();
        Scanner sc1 = new Scanner(System.in);
        int flag = 0;
        int selection;
        double num, den, res, bas;
        while(flag != 1){
            System.out.println("Digite (1) para realizar divisao: \nDigite (2) para realizar operacao log10: \nDigite (3) para sair: ");
            selection = sc1.nextInt();
            try{
                if(selection == 1){
                    System.out.println("Digite o valor do numerador: ");
                    num = sc1.nextDouble();
                    System.out.println("Digite o valor do denominador: ");
                    den = sc1.nextDouble();
                    res = c1.div(num, den);
                    System.out.println("Resultado: " + res);
                }
                else if(selection == 2){
                    System.out.println("Digite o numero que deseja calcular: ");
                    bas = sc1.nextDouble();
                    res = c1.log(bas);
                    System.out.println("Resultado: " + res);
                } else if(selection == 3){
                    flag = 1;
                }
                
            } catch (Exception e){
                System.out.println("Nao foi possivel efetuar operacao!\n\n");
                e.printStackTrace();
            }   
        }
    }
}
