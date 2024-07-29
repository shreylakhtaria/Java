class Static_class {
    static int x = 10;
}

class Call_class extends Static_class {
    int x = 20;

    void display() {
        System.out.println("Value of static x in A: " + super.x);
        System.out.println("Value of instance x in B: " + this.x);
    }
}

public class Prac4_4 
{
    public static void main(String[] args) {
        Call_class obj = new Call_class();
        obj.display();
    }
}
