public class Driver {
    static int minAgeDriving=18;
    String name;
    int age;
    String dateOfLicense;
    public boolean isAllowedToDrive(){
        return this.age>=minAgeDriving;
    }


    static void main(String[] args) {
//        Car myCar=new Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(3);
//        System.out.println(myCar.getCurrentFuelInLitre());
          Car swift=new Car("Red");
          Car thar=new Car();
//          swift.addFuel(6);
          swift.start().drive();
        System.out.println(swift.color);
//          Driver myDriver=new Driver();
//
//        System.out.println(minAgeDriving);

    }
}
