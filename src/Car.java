public class Car {
    String Manufacturer;
    String Model;
    int Year;
    public Car(String Manufacturer, String Model, int Year) {
        this.Manufacturer = Manufacturer;
        this.Model = Model;
        this.Year = Year;
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
