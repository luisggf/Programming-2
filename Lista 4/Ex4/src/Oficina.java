import java.util.Random;

    public class Oficina {
        veicle V1 = new Bicicleta();
        veicle V2 = new Automovel();

        public veicle proximo() {
            Random random = new Random();
            int num = random.nextInt(2);
            System.out.println(num);
            if (num != 1) {
                System.out.println("Bicicleta será análisado: ");
                return V1;
                
            } else
                System.out.println("Automóvel será analisada: ");
                return V2;
        }

        public void maintence(veicle V) {
            if(V.getC() == 2){
                V.listChecks();
                V.adjust();
                V.clean();
            } 
            else{
                V.listChecks();
                V.adjust();
                V.clean();
                ((Automovel) V).mudarOleo();
            }
        }
    }

