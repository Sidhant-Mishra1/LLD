package Constructors;

public class Main {
    public static void main(String[] args) {
        //Default constructors
        //Constructors.Car Audi=new Constructors.Car();

        //Custom constructors
        //Constructors.Car Audi=new Constructors.Car();

        //Parameterized constructors
        //Constructors.Car Audi=new Constructors.Car("Audi","Q3",2011);

        //Copy Constructors
        Car Audi=new Car("Audi","Q4",2011);

        // Case 1:Changing the value of the copied object does not change the original object

        Car Audi2=new Car(Audi);
        Audi2.Year=2005;
        Audi2.getYear();
        Audi.getYear();
        Audi2.getManufacturer();
        Audi2.getModel();

        //Case 2: Changing the value of the copied object does changes the original object
//        Constructors.Car Audi3=Audi;
//        Audi3.Year=2005;
//        Audi.getYear();
//        Audi3.getYear();
    }
}