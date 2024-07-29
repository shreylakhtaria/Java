class Degree {
    public void getDegree() {
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree {
    public void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree {
    public void getDegree() {
        System.out.println("I am a Postgraduate");
    }
}

public class Prac4_5 {
    public static void main(String[] args) {
        Degree degree = new Degree();
        Undergraduate undergraduate = new Undergraduate();
        Postgraduate postgraduate = new Postgraduate();

        degree.getDegree();
        undergraduate.getDegree();
        postgraduate.getDegree();
    }
}
