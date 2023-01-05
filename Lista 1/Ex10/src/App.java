import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um número: ");
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        ArrayList<Integer> factors = new ArrayList<>();
        for (int div = 2; 2 < num; ++div) {
            if (num % div == 0) {
                factors.add(div);
                num /= div;
                --div;
            }
        }
        System.out.println(factors);

        
    }
}
