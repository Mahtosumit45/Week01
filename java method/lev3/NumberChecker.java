
public class NumberChecker {
    public static int countDigit(int num)
    {
        // returns the count of digits
        int count = 0;
        while(num > 0){
            count++;
            num/=10;
        }
        return count;
    }
    public static int[] digitArray(int num){
        // returns the array of digits
        int countOfDigit = countDigit(num);
        int[] arr = new int[countOfDigit];
        int id = countOfDigit-1;
        while(num>0){
            arr[id--] = num%10;
            num/=10;
        }
        return arr;
    }
    public static boolean isDuckNumber(int num){

        // return true if the number is duck number
        int[] digits = digitArray(num);
        for(int it : digits){
            if(it != 0) return true;
        }
        return false;

    }
    public static boolean isArmstrongNumber(int num){
        // return true if the number is armstrong number
        int[] digits = digitArray(num);
        int count = digits.length;
        int summ = 0;
        for(int it: digits) summ+=Math.pow(it,count);
        if(num == summ)
            return true;
        return false;
    }
    public static int[] LargestDigit(int[] digits){
        // returns the maximum of the digits element
        int largest = Integer.MIN_VALUE;
        int second_Largest = Integer.MIN_VALUE;
        for(int it : digits){
            if(it > largest){
                largest = it;
                second_Largest = largest;
            }
            else if(it > second_Largest && it != largest)
                second_Largest = it;
        }
        return new int[]{largest,second_Largest};

    }
    public static int[] SmallestDigit(int[] digits){
        // returns the minimum of the digits elements
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MIN_VALUE;
        for(int it : digits){
            if(it < smallest){
                secondSmallest = smallest;
                smallest = it;

            }
            else if(it < secondSmallest && it != smallest)
                secondSmallest = it;
        }
        return new int[]{smallest,secondSmallest};
    }
    public static int[] countArrayDigit(int num){
        // return the array containing the digits of num
        int[] arr = new int[10];
        int[] digits = digitArray(num);
        for(int it: digits){
            arr[it]++;
        }
        return arr;
    }
    public static int sumOfDigit(int[] digits){
        // return the sum of digits in the digits
        int sum = 0;
        for(int it: digits) sum+=it;
        return sum;
    }
    public static int sumOfSquareDigit(int[] digits){
        // return the sum of square of the digits
        int sumSq = 0;
        for(int it: digits) sumSq+=Math.pow(it,2);
        return sumSq;
    }
    public static boolean isHarshadNumber(int num){
        // return true if the number is harshad number
        int[] digits = digitArray(num);
        int sum = sumOfDigit(digits);
        return sum == num;
    }
    public static int[][] frequencyOfDigit(int num){
        // return a 2D array having digit as first column and frequency as second
        int[] freq = countArrayDigit(num);
        int[][] arr = new int[10][2];
        for(int i =0;i<10;i++){
            arr[i][0] = i;
            arr[i][1] = freq[i];

        }
        return arr;

    }
    public static int[] reversedDigitArray(int[] digits){
        // return the reversed digits array
        int[] reversed = new int[digits.length];
        for(int i = 0;i<10;i++){
            reversed[i] = digits[digits.length - i- 1];
        }
        return reversed;
    }
    public static boolean isPalindromeDigit(int[] digits){
        // return true if the digits are in palindrome
        int [] reversed = reversedDigitArray(digits);
        for (int i = 0; i < 10; i++) {
            if(reversed[i] != digits[i])
                return false;
        }
        return true;
    }
    public static boolean isDuckDigits(int[] digits){
        // return true if the num is duck number using the digits array
        for(int it: digits)
            if(it != 0)
                return true;
        return false;
    }
    public static boolean isPrimeNumber(int num){
        // return true if the num is prime number
        int[] factors = factorsOfNumber(num);
        if(factors.length == 2)
            return true;
        return false;

    }
    public static boolean isNeonNumber(int num){
        // return true if the sum of square digit = num
        int[] digits = digitArray(num);
        int sumsq = sumOfSquareDigit(digits);
        return sumsq == num;

    }
    public static boolean isSpyNumber(int num){
        // return true if sum of digit = product of digit
        int[] digits = digitArray(num);
        int summ = sumOfDigit(digits);
        return summ == num;
    }
    public static boolean isAutomorphicNumber(int num){
        // return true if last digit of square of number = num
        int squared = (int)Math.pow(num,2);
        int digit = squared%10;
        return num == digit;
    }
    public static boolean isBuzzNumber(int num){
        // return if ends with 7 or divisible by 7
        int lastDigit = num%10;
        if(lastDigit == 7 || num%7 == 0)
            return true;
        return false;
    }
    public static int[] factorsOfNumber(int num){
        // return array containing the factors
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
    public static int greatestFactor(int[] factors){
        // return the greatest factor
        int greatest = factors[0];
        for(int it: factors)
            greatest = Math.max(greatest,it);
        return greatest;
    }
    public static int sumOfFactors(int[] factors){
        // return the sum of factors
        int summ = 0;
        for(int it: factors)
            summ += it;
        return summ;
    }
    public static int productOfFactors(int[] factors){
        //return the product of factors
        int prod = 1;
        for(int it: factors)
            prod *= it;
        return prod;
    }
    public static long productOfCubeOfFactors(int[] factors){
        // return the product of cube of factors
        long prodOfCube = 1;
        for(int it: factors)
            prodOfCube *= (int)Math.pow(it,3);
        return prodOfCube;

    }
    public static boolean isPerfectNumber(int num){
        // return true if sum of factors = num
        int[] factors = factorsOfNumber(num);
        int summ = sumOfFactors(factors);
        return num == summ;
    }
    public static boolean isAbundantNumber(int num){
        // return true if sum of factors > num
        int[] factors = factorsOfNumber(num);
        int summ = sumOfFactors(factors);
        return summ > num;


    }
    public static boolean isDeficientNumber(int num){
        // return true if sum of factors < num

        int[] factors = factorsOfNumber(num);
        int summ = sumOfFactors(factors);
        return summ < num;
    }
    public static boolean isStrongNumber(int num){
        // return true if the sum of factorials of digits = num
        int sumOfFactorial = 0;
        int[] digits = digitArray(num);
        for(int it: digits){
            int fact = 1;
            for(int i = 1;i<=it;i++)
                fact *= i;
            sumOfFactorial+=fact;
        }
        return sumOfFactorial == num;
    }
    public static void  main(String[] args){
        System.out.println("Done all the methods");
    }


}/**/