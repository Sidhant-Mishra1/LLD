package Constructors;

public class Car {
    String Manufacturer;
    String Model;
    int Year;

    //Custom Constructors
    public Car(){
        this.Manufacturer = "Audi";
        this.Model = "xyz";
        this.Year = 2005;
    }
    //Parameterized constructors
    public Car(String Manufacturer, String Model, int Year) {
        this.Manufacturer = Manufacturer;
        this.Model = Model;
        this.Year = Year;
    }
    //Copy constructors
    public Car(Car other){
        this.Manufacturer = other.Manufacturer;
        this.Model = other.Model;
        this.Year = other.Year;
    }
    void getManufacturer() {
        System.out.println("Manufacturer: " + Manufacturer);
    }
    void getModel() {
        System.out.println("Model: " + Model);
    }
    void getYear() {
        System.out.println("Year: " + Year);
    }
}
