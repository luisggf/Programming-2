public class Bicicleta extends veicle {
    public int adjust(){
        System.out.println("Bicicleta ajustada corretamente!");
        return 1;
    }
    public int clean(){
        System.out.println("Bicicleta limpada!");
        return 1;
    }
    public void listChecks(){
        if(adjust() == 1)
            System.out.println("Bicicleta foi ajustada!");
        else    
            System.out.println("Bicicleta nao foi ajustada");
        if(clean() == 1)
            System.out.println("Bicicleta foi limpada!");
        else    
            System.out.println("Bicicleta nao foi limpada");
    

    }
}