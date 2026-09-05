public class Car {
    static int noOfCarSold;

    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLitre;
    int noOfSeats;

    static {
        noOfCarSold=0;
        System.out.println("im in static");

    }
    {
        noOfCarSold++;
        System.out.println("im in init");
    }


    Car(String color){
        noOfWheels=4;
        this.color=color;
        maxSpeed=150;
        currentFuelInLitre=2;
        noOfSeats=5;
    }
    Car(){
        this("black");
        currentFuelInLitre=45;
//        noOfWheels=4;
//        this.color="black";
//        maxSpeed=150;
//        currentFuelInLitre=2;

    }

    public Car start(){
        if(currentFuelInLitre==0){
            System.out.println("car is out of fuel,cannot start");
        } else if(currentFuelInLitre<5){
            System.out.println("car is in reserved mode, please refuel");
        } else {
            System.out.println("car is started");
        }
        return this;
    }
    public void drive(){
            currentFuelInLitre--;
            System.out.println("car is driving");
    }
    public void addFuel(float currentFuelInLitre){
        this.currentFuelInLitre+=currentFuelInLitre;
    }
    public float getCurrentFuelInLitre(){
        return currentFuelInLitre;
    }
}
