package OOPS.Encapsulation;

class Team {
    private int salary;

    // controlled access using setter
    public void setSalary(int salary) {
        if(salary > 0) {      // only allow positive values
            this.salary = salary;
        }
    }

    // controlled access using getter
    public int getSalary() {
        return salary;
    }
}

public class Security {
    public static void main(String[] args) {
        Team emp = new Team();

        emp.setSalary(-5000);       // ignored because salary cannot be negative
        System.out.println(emp.getSalary());  // Output: 0

        emp.setSalary(50000);       // valid change
        System.out.println(emp.getSalary());  // Output: 50000
    }
}
