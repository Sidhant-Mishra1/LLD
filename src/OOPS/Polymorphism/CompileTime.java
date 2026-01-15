package OOPS.Polymorphism;

//Enables objects to take multiple forms
//Code flexibility and Reusability

public class CompileTime {
    // Compile Time(Static) Polymorphism --> Method/operator overloading

    void start(String Vehicle){
        System.out.println(Vehicle);
    }
    void start(String Vehicle,int speed){
        System.out.println(Vehicle + " " + speed);
    }
    void start(int VehicleId){
        System.out.println(VehicleId);
    }

    // Runtime(Dynamic) Polymorphism
}
