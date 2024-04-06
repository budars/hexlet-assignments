package exercise;

// BEGIN
public class Segment {
    private Point startPoint;
    private Point endPoint;

    public Segment(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getMidPoint() {
        return new Point((getStartPoint().getX() + getEndPoint().getX()) / 2 ,
                (getStartPoint().getY() + getEndPoint().getY()) / 2);
    }
}
// END
