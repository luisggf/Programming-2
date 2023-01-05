import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int num, exp_res;
        System.out.printf("Digite um numero inteiro: ");
        Scanner read = new Scanner(System.in);
        num = read.nextInt();
        exp_res = function(num); 

        System.out.printf("\nO resultado é: %d\n", exp_res);

    }
    public static int function(int n){   
            int res;
            if (n == 2) 
                res = 2;
            else if(n == 1)
                res = 1;
            else    
                res = 2 * function(n - 1) + 3 * function(n - 2);
            return res;
        } 
}

// Escreva uma fun¸c˜ao recursiva que calcule a sequencia dada por:
// F(1) = 1 (1)
// F(2) = 2 (2)
// F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2) (3)