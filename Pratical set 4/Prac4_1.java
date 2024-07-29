// Author : Shrey LAkhtaria
import java.util.*;

class parent_class {
    public void display() {
        System.out.println("This is parent class");
    }
    int a = 10;
    public void print() {
        System.out.println("Value of a is: " + a);
        System.out.println("this is value from parent class");
    }
}

class child_class extends parent_class {
    public void display() {
        System.out.println("This is child class");
    }
    int b = 20;
    public void print() {
        System.out.println("Value of b is: " + b);
        System.out.println("this is value from child class");
    }
}

public class Prac4_1 {
    public static void main(String[] args) {
        parent_class obj1 = new parent_class();
        obj1.display();
        obj1.print();
        child_class obj2 = new child_class();
        obj2.display();
        obj2.print();
        ((parent_class)obj2).print();
    }
}
