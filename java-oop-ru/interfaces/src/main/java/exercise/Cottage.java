package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return area;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public String toString() {
        return getFloorCount() + " этажный коттедж площадью " + getArea() + " метров";
    }

    public int compareTo(Home another) {
        return Double.compare(getArea(), another.getArea());
    }
}
// END
