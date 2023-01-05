import java.util.ArrayList;

import java.util.Collections;
import java.util.Random;


public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int lenght = 50, valor;
        int minor = 0, greater = 0;
        int cont1 = 0, cont2 = 0;
        Random gen = new Random();
        for (int i = 0; i < lenght; i++) {
            numbers.add(gen.nextInt(100));
            Collections.sort(numbers);

        }
        minor = Collections.min(numbers);
        greater = Collections.max(numbers);
        for(int i = 0; i < lenght; i++){
            valor = numbers.get(i);

            if(valor == minor)
                cont2++;
            else if(valor == greater)
                cont1++;
        }
        System.out.println("Maior número: " + Collections.max(numbers) + " Apareceu: " + cont1);
        System.out.println("Menor número: " + Collections.min(numbers) + " Apareceu: " + cont2);
        System.out.println();
        System.out.println(numbers);
    }
}
