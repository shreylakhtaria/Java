interface P1 {
    final int CONSTANT_1 = 100;

    void Printp1();
}

interface P2 {
    final int CONSTANT_2 = 200;
  
    void Printp2();
}

interface P12 extends P1, P2 {
    // final int CONSTANT_P12 = 300;
    void Print3();
}

class Q implements P12 // implement
{
    public void Printp1() { //
        System.out.println("Constant 1: " + CONSTANT_1);
    }

    public void Printp2() {
        System.out.println("Constant 2: " + CONSTANT_2);
    }

    public void Print3() {
        System.out.println("Method 3");
    }
}

public class Prac4_6 {
    public static void main(String[] args) {
        Q q = new Q();
        q.Printp1();
        q.Printp2();
        q.Print3();
    }
}