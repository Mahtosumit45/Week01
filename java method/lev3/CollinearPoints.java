import java.util.Scanner;

public class CollinearPoints {
    public static boolean collinearCheckerSlope(int x1, int y1,int x2,int y2,int x3, int y3)
    {
        double slope1 = (double)(y2-y1)/(x2-x1);
        double slope2 = (double)(y3-y2) /(x3-x2);
        double slope3 = (double) (y3- y1)/ (x3 - x1);
        if(slope1 == slope2 && slope1 == slope3)
            return true;
        return false;

    }
    public static boolean collinearCheckerArea(int x1, int y1,int x2,int y2,int x3, int y3){
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 -y2));
        if(area == 0.0)
            return true;
        return false;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 points ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        if(collinearCheckerArea(x1,y1,x2,y2,x3,y3)){
            System.out.println("Using area YES");
        }
        else System.out.println("Using area NO");

        if(collinearCheckerSlope(x1,y1,x2,y2,x3,y3))
            System.out.println("Using slope YES");
        else System.out.println("Using slope NO");

    }
}
