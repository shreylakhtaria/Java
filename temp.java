class circle
{
private int point;
private double radius;
static int numberOfCricle;

circle()
{
    numberOfCricle++;   
}

static int getnumberOfCricle()
{
    return numberOfCricle;

}
}

public class temp {
    public static void main(String[] args) {
        
        circle c1 = new circle();
        circle c2 = new circle();
        circle c3 = new circle();
        System.out.println(circle.getnumberOfCricle());
    }
    
}
