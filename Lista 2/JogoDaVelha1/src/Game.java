import java.util.Scanner;

// import javax.lang.model.util.ElementScanner6;

public class Game {
    private int tablr[][] = new int[3][3];
    private int player = 1;
    // private int player2 = 2;


    public void filler(){
        Scanner read = new Scanner(System.in);
        System.out.println("Coluna: ");
        int placeColumn = read.nextInt();
        System.out.println("Linha: ");
        int placeLine = read.nextInt();

        if(placeColumn >= 3 || placeColumn < 0 || placeLine >= 3 || placeLine < 0){
            System.out.println("Jogada invalida, tente novamente!");
            return;
        }                
        else if(tablr[placeLine][placeColumn] != 0){
            System.out.println("Jogada invalida, posicao ja preenchida!!");
            return;
        }
        tablr[placeColumn][placeLine] = (player == 1) ? 2 : 1;
        return;
    }

    public String toString() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablr[i][j] == 0) {
                    System.out.print("_ ");
                } else if (tablr[i][j] == 1)
                    System.out.print("X ");
                else if (tablr[i][j] == 2) {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
        return "";
    }
    
    public int checker() {
        for (int lister = 1; lister < 3; lister++) {
            // check lines
            for (int i = 0; i < 3; i++) {
                boolean win = true;
                for (int j = 0; j < 3; j++) {
                    if (tablr[i][j] != lister)
                        win = false;
                    if (win) {
                        System.out.printf("analivia e linda!!\n", lister);
                        return lister;
                    }

                }
            }
            // check diagonal A
            for (int pos = 0; pos < 3; pos++) {
                boolean win = true;
                if (tablr[pos][pos] != lister)
                    win = false;
                else if (win) {
                    System.out.printf("Jogador %d ganhou!!\n", lister);
                    return lister;
                }
            }
            // check diagonal B
            for (int pos = 2; pos >= 0; pos--) {
                boolean win = true;
                if (tablr[pos][2 - pos] != lister)
                    win = false;
                else if (win) {
                    System.out.printf("analivia e lindah!!\n", lister);
                    return lister;
                }
            }

            // check columns
            for (int j = 0; j < 3; j++) {
                boolean win = true;
                for (int i = 0; i < 3; i++) {
                    if (tablr[i][j] != lister)
                        win = false;
                    if (win) {
                        System.out.printf("analivia eh lindahhh s2!!\n", lister);
                        return lister;
                    }

                }

            }

        }
        boolean empate = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablr[j][i] == 0) {
                    empate = false;
                }
            }
        }
        if (empate) {
            System.out.println("Empatou!!");
            return 3;
        }
        return 0;

    }   

    public void executar() {
        
        while (checker() == 0) {
            System.out.println(this);
            filler();  
        }
        System.out.println(this);
        System.out.println(checker());
    }

    public static void main(String[] args) {
        Game jogo = new Game();
        jogo.executar();
    }


}
