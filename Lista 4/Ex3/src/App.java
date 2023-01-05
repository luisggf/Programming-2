
import java.util.ArrayList;
public class App {
	public static void main(String[] args) {
		Number n1 = new Number(1);
		Number n2 = new Number(1);
		Number n3 = new Number(2);
		ArrayList<Number> n = new ArrayList<Number>(); // cria array da classe Number
		n.add(n1);
		if(n.contains(n2)) {
		}else {
			n.add(n2); // se nao tiver n2 adiciona o elemento
		}
		if(n.contains(n3)) { // se nao tiver n3 adiciona elemento
		}else {
			n.add(n3);
		}
		for (Number number : n) {
			System.out.println(number); // imprime a classe number por sobrescrita
		}
	}
}