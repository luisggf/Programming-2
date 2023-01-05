import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner leitor = new Scanner(System.in);
        int qtd; 
        int matriz[][] = new int[3][3];
        for (int i = 0; i < matriz.lenght; i++){
            for (int j = 0; j < matriz.lenght; j++){
                matriz[i][j] = leitor.nextInt();
            }
        }
        rotacionarMatrizAntiHorario(matriz);
        for (int i = 0; i < matriz.lenght; i++){
            for (int j = 0; j < matriz.lenght; j++){
                System.out.print(matriz[i][j]);
            }
        }

        // System.out.println("Digite o número de serviços realizados: ");
        // qtd = leitor.nextInt();
        // System.out.println( "A pessoa receberá "  (qtd * 0.5 * 20) );
    

    public static int[][] rotacionarMatrizHorario(int[][] matriz) {
        int largura = matriz.length;
        int altura = matriz[0].length;
        int[][] ret = new int[altura][largura];
        for (int i=0; i<altura; i++) {
            for (int j=0; j<largura; j++) {
                ret[i][j] = matriz[largura - j - 1][i];
            }
        }
        return ret;
    }


    public static int[][] rotacionarMatrizAntiHorario(int[][] matriz) {
        int largura = matriz.length;
        int altura = matriz[0].length;   
        int[][] ret = new int[altura][largura];
        for (int i=0; i<altura; i++) {
            for (int j=0; j<largura; j++) {
                ret[i][j] = matriz[j][altura - i - 1];
            }
        }
        return ret;
        }
    }
}