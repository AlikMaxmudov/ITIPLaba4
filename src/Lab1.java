
import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args){

        Scanner in = new Scanner (System.in);
        Point3d firstPoint = new Point3d();
        Point3d secondPoint = new Point3d(1,8,9);
        Point3d thirdPoint = new Point3d(9,4,3);
        Point3d distance = new Point3d();

        //ввод  координат firstPoint
        System.out.println("Enter the x value of the first point ");
        double x = Double.parseDouble(in.nextLine());
        System.out.println("Enter the y value of the first point");
        double y = Double.parseDouble(in.nextLine());
        System.out.println("Enter the y value of the z point");
        double z = Double.parseDouble(in.nextLine());
// установление координат firstPoint
        firstPoint.setX(x);
        firstPoint.setY(y);
        firstPoint.setZ(z);

        //ввод  координат secondPoint
        System.out.println("Enter the x value of the second point");
        double x2 = Double.parseDouble(in.nextLine());
        System.out.println("Enter the y value of the second point");
        double y2 = Double.parseDouble(in.nextLine());
        System.out.println("Enter the z value of the second point");
        double z2 = Double.parseDouble(in.nextLine());
// установление координат secondPoint
        secondPoint.setX(x2);
        secondPoint.setY(y2);
        secondPoint.setZ(z2);

        //ввод  координат thirdPoint
        System.out.println("Enter the x value of the third point");
        double x3 = Double.parseDouble(in.nextLine());
        System.out.println("Enter the y value of the third point");
        double y3 = Double.parseDouble(in.nextLine());
        System.out.println("Enter the z value of the third point");
        double z3 = Double.parseDouble(in.nextLine());
// установление координат thirdPoint
        thirdPoint.setX(x3);
        thirdPoint.setY(y3);
        thirdPoint.setZ(z3);


        // подсчет
        double a= distance.distase(firstPoint.getX(), firstPoint.getY(), firstPoint.gexZ(), secondPoint.getX(), secondPoint.getY(), secondPoint.gexZ());
        double b = distance.distase(secondPoint.getX(), secondPoint.getY(), secondPoint.gexZ(), thirdPoint.getX(),thirdPoint.getY(),thirdPoint.gexZ());
        double c = distance.distase(firstPoint.getX(), firstPoint.getY(), firstPoint.gexZ(), thirdPoint.getX(),thirdPoint.getY(),thirdPoint.gexZ());
        if (a==b || b==c || a==c){
            System.out.println("both sides are equal");
        }
        else{
            System.out.printf("%.2f",computeArea(a, b, c));
        }
    }
    public static double computeArea(double a, double b, double c){
        double  p= (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
