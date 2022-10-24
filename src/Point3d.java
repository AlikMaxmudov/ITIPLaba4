import java.text.Format;


public class Point3d extends Point2d {
    private double ZCord;

    public Point3d(double x, double y, double z) {
        super(x, y);
        ZCord = z;
    }

    public Point3d() {
        this(0, 0, 0);
    }

    public double gexZ() {
        return ZCord;
    }

    public void setZ(double numb) {
        ZCord = numb;
    }

    public boolean Compare(double x, double y, double z, double x2, double y2, double z2) {
        if (x == x2 && y == y2 && z == z2) {
            return true;
        }
        return false;
    }

    public double distase(double x, double y, double z, double x2, double y2, double z2) {
        return (Math.sqrt(Math.pow((x2 - x), 2) + Math.pow((y2 - y), 2) + Math.pow((z2 - z), 2)));
    }
}