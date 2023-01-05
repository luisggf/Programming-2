import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);
        int NUM_MESES = 2;
        int NUM_SEMANAS = 4;
        float Matriz[][] = new float[NUM_MESES][NUM_SEMANAS];
        System.out.println("Digite quanto recebeu em cada semana do mês: ");
        for (int i = 0; i < NUM_MESES; i++){
            for (int j = 0; j < NUM_SEMANAS; j++){
                System.out.printf("Semana %d do mes %d: ", j+1, i+1);
                Matriz[i][j] = leitor.nextFloat();
            }
        }
        float totalAno = 0;
        for (int i = 0; i < NUM_MESES; i++){
            for (int j = 0; j < NUM_SEMANAS; j++){
                totalAno += Matriz[i][j]; 
            }
        }
        System.out.printf("Total recebido no ano: %.2f\n\n", totalAno);

    
        float TotMes[] = new float[NUM_MESES];
        for (int i = 0; i < NUM_MESES; i++){
            for (int j = 0; j < NUM_SEMANAS; j++){
                TotMes[i] += Matriz[i][j];
            }  
            System.out.printf("Total do mes %d: %.2f\n", i+1, TotMes[i]);
        }

        for (int i = 0; i < NUM_MESES; i++){
            for (int j = 0; j < NUM_SEMANAS; j++){
                System.out.printf("Total da semana %d: %.2f\n", j+1, Matriz[i][j]);    
            }  
            
        }
  
    }

    
}
