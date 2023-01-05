public class Automovel extends veicle {
    public int adjust(){
        System.out.println("automóvel ajustado corretamente!");
        return 1;
    }
    public int clean(){
        System.out.println("automóvel limpada!");
        return 1;
    }
    public int mudarOleo(){
        System.out.println("Óleo trocado!");
        return 1;
    }
    public void listChecks(){
        if(adjust() == 1)
            System.out.println("automóvel foi ajustado!");
        else    
            System.out.println("automóvel nao foi ajustado");
        if(clean() == 1)
            System.out.println("automóvel foi limpado!");
        else    
            System.out.println("automóvel nao foi limpado");
        if(mudarOleo() == 1)
            System.out.println("Óleo do automóvel foi trocado!");
        else    
            System.out.println("Óleo do automóvel nao foi trocado");
    
    }   
}
