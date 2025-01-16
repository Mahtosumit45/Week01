public class OtpGenerator {
    public static int[] generateOTP(int size){
        int[] otps = new int[size];
        for (int i = 0; i < size; i++) {
            int otp = (int)(Math.random()*900000) + 100000;
            otps[i] = otp;
        }
        return otps;
    }
    public static boolean isUnique(int[] otps){
        for(int i = 0;i<otps.length;i++){
            for(int j = 0;j<otps.length;j++){
                if(i == j)
                    continue;
                if(otps[i] == otps[j])
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        // generate otp using the function
        int[] otps = generateOTP(10);
        if(isUnique(otps))
            System.out.println("They are unique");
        else
            System.out.println("They are not unique");
    }




}
