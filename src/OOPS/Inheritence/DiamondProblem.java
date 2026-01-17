package OOPS.Inheritence;
class A{
    void show(){
        System.out.println("A");
    }
}
class B extends A{}
class C extends A{}

public class DiamondProblem extends B,C{
    //Diamond problem --> A Class cannot extend multiple classes
    // This code will not compile
}
