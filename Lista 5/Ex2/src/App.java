import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, Workers> map = new HashMap<>();
        // Workers f1 = new Workers("a1234", "Steve Jobs");
        // Workers f2 = new Workers("a1235", "Scott McNealy");
        // Workers f3 = new Workers("a1236", "Jeff Bezos");
        // Workers f4 = new Workers("a1237", "Larry Ellison");
        // Workers f5 = new Workers("a1238", "Bill Gates");
        

        Map<String, String> mapa = new HashMap<>();
        mapa.put("a123", "Steve Jobs");
        mapa.put("a124", "Scott McNealy");
        mapa.put("a125", "Jeff Bezos");
        mapa.put("a126", "Larry Ellison");
        mapa.put("a127", "Bill Gates");

        Set<String> keys = mapa.keySet();

        for (String key : keys) { // imprimindo strings nome pelas respectivas chaves
            System.out.println("Chaves: " + key + " valor: " + mapa.get(key));
        }
        System.out.println(mapa.get("a128")); // testando chave inexistente

        // Collection<String> values = mapa.values();
        // System.out.print("Valores: ");
        // for(String value : values){
        // System.out.print(value + " ");
        // }
        // System.out.println();
    }

}
