public class Car {
    public String model;
    public int year;
    public String color;
    public String energySource;
    public int renavam;
    public String plate;
    float acceleration;
    private int vel = 0;

    public Car() {
        
    }

    public Car(String model, int year, int renavam, String energySource, String plate, String color){
        this.model = model;
        this.year = year;
        this.renavam = renavam;
        this.color = color;
        this.plate = plate;
        this.energySource = energySource;

    }

    public void CarFunction(float acceleration){
        this.acceleration = acceleration;
    } 

    public void boostVel(){
        this.vel = 10;
    }

}
