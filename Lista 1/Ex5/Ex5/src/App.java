import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner leitor = new Scanner(System.in);
        int matriz1[][] = new int[3][3];
        System.out.println("Digite os elementos da matriz");
        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1.length; j++){
                matriz1[i][j] = leitor.nextInt();
            }
        }
        rotacionarMatrizAntiHorario(matriz1);
        System.out.println("Mostrará a matriz rotacionada: ");
        for (int i = 0; i < matriz1.length; i++){
            System.out.println();
        for (int j = 0; j < matriz1.length; j++){
            System.out.print(matriz1[i][j] + " ");
        }
    }
    System.out.println( );
        rotacionarMatrizHorario(matriz1);
        for (int i = 0; i < matriz1.length; i++){
                System.out.println();
            for (int j = 0; j < matriz1.length; j++){
                System.out.print(matriz1[i][j] + " ");
            }
        }
    }

    public static int[][] rotacionarMatrizHorario(int[][] matriz) {
        int largura = matriz.length;
        int altura = matriz[0].length;
        int[][] ret = new int[altura][largura];
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                ret[i][j] = matriz[largura - j - 1][i];
            }
        }
        return ret;
    }


    public static int[][] rotacionarMatrizAntiHorario(int[][] matriz) {
        int largura = matriz.length;
        int altura = matriz[0].length;   
        int[][] ret = new int[altura][largura];
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                ret[i][j] = matriz[j][altura - i - 1];
            }
        }
        return ret;
    }
}
