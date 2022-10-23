import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {


        Scanner num = new Scanner(System.in);
        Point3d firstPoint = new Point3d();
        Point3d secondPoint = new Point3d();
        Point3d thirdPoint = new Point3d();
        Point3d DistanceTO = new Point3d();

        System.out.println("Enter X meaning: ");
        double first = num.nextDouble();
        System.out.println("Enter Y meaning: ");
        double second = num.nextDouble();
        System.out.println("Enter Z meaning: ");
        double third = num.nextDouble();
        firstPoint.setX(first);
        firstPoint.setY(second);
        firstPoint.setZ(third);

        System.out.println("Enter second X meaning: ");
        double firstOne = num.nextDouble();
        System.out.println("Enter second Y meaning: ");
        double secondTwo = num.nextDouble();
        System.out.println("Enter second Z meaning: ");
        double thirdThree = num.nextDouble();
        secondPoint.setX(firstOne);
        secondPoint.setY(secondTwo);
        secondPoint.setZ(thirdThree);

        System.out.println("Enter third X meaning: ");
        double firstLast = num.nextDouble();
        System.out.println("Enter third Y meaning: ");
        double secondLast = num.nextDouble();
        System.out.println("Enter third Z meaning: ");
        double thirdLast = num.nextDouble();
        thirdPoint.setX(firstLast);
        thirdPoint.setY(secondLast);
        thirdPoint.setZ(thirdLast);

        double a = DistanceTO.DistanceTO(firstPoint.gexX(), firstPoint.gexY(), firstPoint.gexZ(), secondPoint.gexX(), secondPoint.gexY(), secondPoint.gexZ());
        double b = DistanceTO.DistanceTO(secondPoint.gexX(), secondPoint.gexY(), secondPoint.gexZ(), thirdPoint.gexX(),thirdPoint.gexY(),thirdPoint.gexZ());
        double c = DistanceTO.DistanceTO(firstPoint.gexX(), firstPoint.gexY(), firstPoint.gexZ(), thirdPoint.gexX(),thirdPoint.gexY(),thirdPoint.gexZ());
        if (a==b || b==c || a==c){
            System.out.println("Two sides are equal");
        }
        else{
        System.out.printf("%.2f",computeArea(a, b, c));
        }


   }

    private static double computeArea(double a, double b, double c) {
        double function = (a+b+c)/2;
        return Math.sqrt(function * (function-a)*(function-b) * (function-c));
    }

}
