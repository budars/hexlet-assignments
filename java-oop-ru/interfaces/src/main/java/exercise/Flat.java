package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getArea() {
        return area + balconyArea;
    }

    public int getFloor() {
        return floor;
    }

    public double getCommonArea() {
        return getArea();
    }

    public String toString() {
        return "Квартира площадью " + getCommonArea() + " метров на " + getFloor() + " этаже";
    }

    public int compareTo(Home another) {
        return Double.compare(getArea(), another.getArea());
    }
}
// END
