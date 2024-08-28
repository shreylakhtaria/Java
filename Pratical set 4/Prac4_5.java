class Degree {
    public void getDegree() {
        System.out.println("I got a degree");
    }
}

 // here super is ussed to reffer imidate parent class
class Undergraduate extends Degree {
    public void get_Degree() {
        super.getDegree();
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree {
    public void get_Degree() {
        System.out.println("I am a Postgraduate");
    }
}

public class Prac4_5 {
    public static void main(String[] args) {

        Undergraduate undergraduate = new Undergraduate();
        Postgraduate postgraduate = new Postgraduate();

        undergraduate.get_Degree();
        postgraduate.get_Degree();
    }
}
