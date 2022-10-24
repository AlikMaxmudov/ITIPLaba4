public class Point2d {

    private double XCord;
    private double YCord;

    public Point2d(double x, double y) {
        XCord = x;
        YCord = y;
    }

    public double getX() {
        return XCord;
    }

    public double getY() {
        return YCord;
    }

    public void setX(double val) {
        XCord = val;
    }

    public void setY(double val) {
        YCord = val;
    }

    public Point2d() {
        this(0, 0);
    }

    public static void main(String[] args) {

        Point2d myPoint = new Point2d();
        Point2d myOtherPoint = new Point2d(5, 3);
        Point2d aThirdPoint = new Point2d();
        System.out.print(myPoint.XCord + " ");
        System.out.println(myPoint.YCord);
        System.out.print(myOtherPoint.XCord + " ");
        System.out.println(myOtherPoint.YCord);
        System.out.print(aThirdPoint.XCord + " ");
        System.out.println(aThirdPoint.YCord);
        if (proverka(myPoint.XCord, myPoint.YCord, aThirdPoint.XCord, aThirdPoint.YCord)) {
            System.out.println("the coordinates of the first point are equal to the coordinates of the second point");
        } else {
            System.out.println("the coordinates are not equal");
        }
    }

    public static boolean proverka(double x, double y, double x2, double y2) {
        if (x == x2 && y == y2) {
            return true;
        }
        return false;
    }
}

