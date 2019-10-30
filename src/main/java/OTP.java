import java.security.SecureRandom;
import java.util.ArrayList;

public class OTP {

    private SecureRandom rand;
    private ArrayList<Integer> otp;

    // User provides OTP
    public OTP(String usr_otp){


    }

    // Generate random OTP to match plaintext object
    public OTP(int length){

        otp = new ArrayList<>();
        rand = new SecureRandom();

        length = makeDivisibleByFive(length);

        for(int count = 0; count < length; count++)
            otp.add(rand.nextInt(10));
    }

    private int makeDivisibleByFive(int num) {

        while(num%5 != 0)
            num++;

        return num;
    }

    public ArrayList<Integer> getOtp() {
        return otp;
    }
}
