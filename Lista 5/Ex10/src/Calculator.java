import java.lang.Math;
public class Calculator {


    public double div(double x, double y){
        if(y == 0){
            throw new Exception("Nao e possivel dividir por 0");
        } else
            return x / y;
       

    }
    public double log(double base){
        if(base < 0){
            throw new Exception("Base logaritmica deve ser positiva");
        }
        return Math.log10(base);
        
    }


    
}
