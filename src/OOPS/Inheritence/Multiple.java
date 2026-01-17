package OOPS.Inheritence;

// Diamond problem is solved using interfaces because Java forces the class to override the conflicting method and resolve the ambiguity.

interface X{
    void show();
}

interface Y{
    void show();
}
public class Multiple implements X,Y{
    @Override
    public void show() {
        System.out.println("Resolved in Multiple");
    }
    public static void main(String[] args) {
        Multiple m = new Multiple();
        m.show();
    }
}
