import java.util.*;
public class FactorsList{
    public static void main(String[] args){
        // Creating a scanner for taking inputs
        Scanner sc = new Scanner(System.in);

        // Create a variable to store the number input
        int num = sc.nextInt();
        // Create  an array to store the factors of number
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int count = 0;
        int id = 0;
        for(int i = 1;i<=num/2;i++){
            if(num %i == 0){
                if(id == maxFactor){
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors,0,temp,0,factors.length);
                    factors = temp;
                }
                factors[id++] = i;
            }
        }


        System.out.print("Factors of " + num + " are: ");
        for(int it:factors){
            System.out.print(it+" ");
        }
    }
}


