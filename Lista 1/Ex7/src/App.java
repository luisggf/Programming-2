import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite a quantida de produtos: ");
        int num_p = Integer.parseInt(read.nextLine());
        Invoice product[] = new Invoice[num_p];
        for (int i = 0; i < num_p; i++){
            System.out.printf("\nDigite o nome do produto %d: ", i+1);
                // Invoice p1 = new Invoice(product_dscpt, productcode, buy_amount, unitary_prz);
                String prod_dsc = read.nextLine();
                // fl1[i].FlowerType = read.nextLine();
    
                System.out.printf("\nDigite quantos itens foram comprados: ");
      
                int buy_Amount = Integer.parseInt(read.nextLine());
    
                System.out.printf("\nDigite o preco unitario do produto: ");
                // fl1[i].RemainingFlower = read.nextInt();
                Float unitary_prz1 = Float.parseFloat(read.nextLine());

                System.out.printf("\nDigite o codigo do produto: ");
                // fl1[i].RemainingFlower = read.nextInt();
                int productcd = Integer.parseInt(read.nextLine());
                Invoice p1 = new Invoice(prod_dsc, productcd, buy_Amount, unitary_prz1);
                product[i] = p1;
                double total = getInvoiceAmount(product[i].buy_amount, product[i].unitary_prz);
                System.out.printf("\n Preco total arrecadado com o produto %s: %lf ", product[i].product_dscpt, total);
        }
               
    }
    public static double getInvoiceAmount(int x, float y){
        double total1 = x * y;
        return total1;
    }
}
