import java.security.SecureRandom;
import java.util.ArrayList;

public class OTP {

    private SecureRandom rand;
    private ArrayList<Integer> otp;

    // User provides OTP
    public OTP(String usr_otp) {

        otp = new ArrayList<>();
        rand = new SecureRandom();

        // Convert to integer array
        for (char num : usr_otp.toCharArray())
            otp.add((int) num);

        // Compute integers
        for (int count = 0; count < otp.size(); count++)
            otp.set(count, asciiTo123(otp.get(count)));

        // Validate and make divisible by 5
        validateOTP();


    }

    // Generate random OTP to match plaintext object
    public OTP(int length) {

        otp = new ArrayList<>();
        rand = new SecureRandom();

        length = makeDivisibleByFive(length);

        for (int count = 0; count < length; count++)
            otp.add(rand.nextInt(10));
    }

    private int makeDivisibleByFive(int num) {

        while (num % 5 != 0)
            num++;

        return num;
    }

    private Integer asciiTo123(int num) {

        if (num >= 48 && num <= 57)
            return num - 48;
        else
            return -1;
    }

    private void validateOTP() {

        // Remove invalid numbers
        for (int count = 0; count < otp.size(); count++) {
            if (otp.get(count) == -1) {
                otp.remove(count);
                count--;
            }
        }

        // Make divisible by 5
        int length = makeDivisibleByFive(otp.size());
        int new_length = length - otp.size();

        for (int count = 0; count < new_length; count++)
            otp.add(rand.nextInt(10));
    }

    public ArrayList<Integer> getOTP() {
        return otp;
    }

    public int getOTPAt(int num) {
        return otp.get(num);
    }
}
