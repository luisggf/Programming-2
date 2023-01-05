import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
            System.out.printf("Quantas flores deseja gerir: ");
            Scanner read = new Scanner(System.in);
            int QuantTypeFlowers = Integer.parseInt(read.nextLine());
            int MustBuy;
            Flower fl1[] = new Flower[QuantTypeFlowers];
            for (int i = 0; i < QuantTypeFlowers; i++){
                System.out.printf("\nDigite o nome da flor %d: ", i+1);
    
                String flowertype = read.nextLine();
    
                // fl1[i].FlowerType = read.nextLine();
    
                System.out.printf("\nDigite a quantidade ideal de estoque desse tipo: ");
                // fl1[i].QuantFlower = read.nextInt();
                int quantflower = Integer.parseInt(read.nextLine());
    
                System.out.printf("\nDigite a quantidade de flores restantes desse tipo: ");
                // fl1[i].RemainingFlower = read.nextInt();
                int remainingflower = Integer.parseInt(read.nextLine());
    
                Flower f = new Flower(flowertype, quantflower, remainingflower);
                fl1[i] = f;
    
                if(fl1[i].RemainingFlower < (0.4 * fl1[i].QuantFlower)){
                    MustBuy = fl1[i].QuantFlower - fl1[i].RemainingFlower;
                    System.out.printf("O floricultor deve comprar mais %d flores do tipo %s\n", MustBuy, fl1[i].FlowerType);
                }
                else if(fl1[i].QuantFlower < 0 || fl1[i].RemainingFlower < 0){
                    System.out.printf("A quantidade digitada deve ser maior que zero");   
                    break;
                }
                else{
                    System.out.printf("Quantidade de flores é suficiente.");
                }   
            }
            // partindo da premissa que a quantidade de flores em estoque seja 40% do numero ideal entao o floricultor deve comprar mais flores desse tipo
    
        }
    }
    
