package OOPS.Encapsulation;

// Allows developers to change the internal implementation of a class without affecting external code

class Employee {
    private int age;

    // setter
    public void setAge(int age) {
        // Flexibility: we can change the validation logic here anytime without affecting main() or other code
        if(age > 0){
            this.age = age;
        }
    }
    // getter
    public int getAge() {
        return age;
    }

}
public class Flexibility {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setAge(20);
        System.out.println(employee.getAge());
    }
}
