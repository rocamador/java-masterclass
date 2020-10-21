public class Point {

    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x*x+y*y);
    }

    public double distance(int x2, int y2) {
        return Math.sqrt((x2-x)*(x2-x)+(y2-y)*(y2-y));
    }

    public double distance(Point p) {
        return Math.sqrt((p.x-x)*(p.x-x)+(p.y-y)*(p.y-y));
    }
}
