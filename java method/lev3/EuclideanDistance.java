import java.util.Scanner;

public class EuclideanDistance {
    public static int calculateEuclideanDistance(int x1,int y1,int x2,int y2){
        int a = (int) Math.sqrt((int)Math.pow((x2-x1),2));
        int b = (int) Math.sqrt((int)Math.pow((y2-y1),2));
        return a+b;

    }
    public static void showEquation(int x1,int y1,int x2,int y2)
    {
        double m =(double)(y2-y1)/(x2-x1);
        double b = (double)y1 - (m*x1);
        System.out.println(" y = "+m+"x + "+b);

    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co ordinates of the point");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        calculateEuclideanDistance(x1,y1,x2,y2);
        showEquation(x1,y1,x2,y2);
    }
}
