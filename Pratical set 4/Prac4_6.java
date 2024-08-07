interface P1 {
    final int CONSTANT_1 = 100;     
    void method1();
}

interface P2 {
    final int CONSTANT_2 = 200;

    void method2();
}

interface P12 extends P1, P2 {
    // int CONSTANT_P12 = 300;
    void method3();
}

class Q implements P12 // implement
{
    public void method1() { // 
        System.out.println("Constant 1: " + CONSTANT_1);
    }

    public void method2() {
        System.out.println("Constant 2: " + CONSTANT_2);
    }

    public void method3() {
        // System.out.println("Method 3" + CONSTANT_P12);
    }
}
public class Prac4_6 {
    public static void main(String[] args) {
        Q q = new Q();
        q.method1();
        q.method2();
        q.method3();
    }
}