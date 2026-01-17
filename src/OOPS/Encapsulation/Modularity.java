package OOPS.Encapsulation;

// Encapsulation keeps data and related methods together in a single class.
class office{
    private String CompanyName;

    // setter
    void setCompanyName(String companyName){
        this.CompanyName = companyName;
    }
    // getter
    public String getCompanyName() {
        return CompanyName;
    }

    // method to display info
    public void displayInfo(){
        System.out.println("Company Name: " + CompanyName);
    }

}
public class Modularity {
    public static void main(String[] args) {
        office office = new office();
        office.setCompanyName("Cisco Systems");
        office.displayInfo();
    }
}
