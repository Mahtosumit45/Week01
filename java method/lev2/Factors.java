import java.util.Scanner;

public class Factors {
    public static int[] factorsFinder(int num){
        int maxfactor = 10;
        int[] arr = new int[maxfactor];
        int id = 0;

        for(int i =1 ;i<=num/2;i++){
            if(id == maxfactor){
                maxfactor *= 2;
                int[] temp = new int[maxfactor];
                System.arraycopy(arr,0,temp,0,arr.length);
                arr = temp;

            }
            if(num%i == 0){
                arr[id++] = i;
            }
        }
        return arr;
    }
    public static int sum(int[] arr){
        int s = 0;
        for(int it: arr)
            s+= it;
        return s;

    }
    public static long products(int[] arr){
        long p = 1;
        for(int it:arr) {
            if(it == 0) continue;
            p *= it;
        }
        return p;

    }
    public static long sumOfSquare(int[] arr){
        long ss = 1;
        for(int it: arr)
            ss += Math.pow(it,2);
        return ss;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        // Taking input of the number
        int num = sc.nextInt();
        // getting the factors
        int[] factors = factorsFinder(num);
        // getting all the things like the sum,product amd sum of sqare of factors

        int sumOfFactors = sum(factors);
        long productOfFactors = products(factors);
        long sumofSq = sumOfSquare(factors);


        System.out.println("Factors are ");
        for(int it: factors) {
            if(it == 0) continue;
            System.out.print(it + " ");
        }
        System.out.println("\n Sum of factors = "+sumOfFactors+"\n product of factors = "+productOfFactors+"\n Sum of Square of Factors = "+sumofSq);





    }
}
