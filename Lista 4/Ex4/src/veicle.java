
import java.util.Random;

public abstract class veicle {
    public abstract int adjust();
    public abstract int clean();
    public abstract void listChecks();
    public int getC() {
        Random random = new Random();
        int num = random.nextInt(2);
        return num;
    }
    
    
}
