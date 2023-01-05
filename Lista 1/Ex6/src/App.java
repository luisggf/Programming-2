import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        // System.out.printf("Digite o modelo do carro: ");
        String model = "unao";
        // System.out.printf("Digite o modelo do carro: ");
        int year = 1996;
        int renavam = 21342424;
        String energySource = "Gasolina";
        String plate = "GQG1122";
        String color = "Vermelho";
        // System.out.printf("Modelo: %s", car1.model);
        Car car1 = new Car(model, year, renavam, energySource, plate, color);
        System.out.println(car1);

    }
}
