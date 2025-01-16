import java.util.Scanner;

public class Quadratic {
    public static int[] roots(int delta, int a,int b){
        if(delta == 0){
            int x1 = (-1*b)/(2*a);
            return new int[]{x1};

        }
        else if(delta > 0){
            int x1 = (int)((-1*b) + Math.sqrt(delta)) / (2*a);
            int x2 = (int)((-1*b) - Math.sqrt(delta)) / (2*a);
            return new int[]{x1,x2};
        }
        return new int[]{};

    }
    public static int deltaCalc(int a, int b, int c){
        return (b*b) - 4*a*c;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int delta = deltaCalc(a,b,c);
        int[] arr = roots(delta,a,b);
        if(arr.length == 0){
            System.out.println("There is zero root");
        }
        if(arr.length == 1){
            System.out.println("Root is "+arr[0]);
        }
        else{
            System.out.println("Roots are "+arr[0]+" and "+arr[1]);
        }
    }
}
