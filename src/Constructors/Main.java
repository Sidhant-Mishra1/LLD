package Constructors;

public class Main {
    public static void main(String[] args) {
        //Default constructors
        //Car Audi=new Car();

        //Custom constructors
        //Car Audi=new Car();

        //Parameterized Constructors
        //Car Audi=new Car("Audi","Q3",2011);

        //Copy Constructors
        Car Audi=new Car("Audi","Q4",2011);

        // Case 1:Changing the value of the copied object does not change the original object(deep copy)

        Car Audi2=new Car(Audi);
        Audi2.Year=2005;
        Audi2.getYear();
        Audi.getYear();
        Audi2.getManufacturer();
        Audi2.getModel();

        //Case 2: Changing the value of the copied object does changes the original object(shallow copy)
        //Car Audi3=Audi;
        //Audi3.Year=2005;
        //Audi.getYear();
        //Audi3.getYear();

        //Calling Private Constructors
        //both s1 and s2 are referring to the same instance
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println(s1==s2);
    }
}