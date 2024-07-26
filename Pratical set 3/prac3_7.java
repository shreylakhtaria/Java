//author : shrey akhtaria
class Area {
    int radius;

    public Area(int radius) {
        this.radius = radius;
    }

    public Area(Area a) {
        this.radius = a.radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

public class prac3_7 {
    public static void main(String[] args) {
        Area a = new Area(5);
        System.out.println(a.getRadius());
        a.setRadius(10);
        System.out.println(a.getRadius());

        Area a2 = new Area(a);
        System.out.println(a2.getRadius());

    }
}