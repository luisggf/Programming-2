public class App {

    public static void main(String[] args) {
        System.out.println("inicio do main");
        metodol();
        System.out.println("fim do main");
    }

    static void metodol() {
        System.out.println("inicio do metodol");
        metodo2();
        System.out.println("fim do metodo1");
    }

    static void metodo2() {
        System.out.println("inicio do metodo2");
        int[] array = new int[10];
        try {
            for (int i = 0; i < 15; i++) { // a excessao ocorre pois o laco tenta acessar posicoes do vetor q ainda nao
                                           // foram preenchidas
                array[i] = i; // portanto deve-se respeitar os limites do array para que o programa execute
                              // normalmente
                System.out.println(i);
            }
        } catch (Exception ArrayIndexOutOfBoundsException) {
            System.out.println("Posicao de vetor inalcancavel, corrigindo temos: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
                System.out.println(i);
            }
        }
        System.out.println("fim do metodo2");
    }

}
