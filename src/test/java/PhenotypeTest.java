public class PhenotypeTest {

    public static void main(String[] args){

        System.out.println("Input:\t\t \"hello!\"");
        Plaintext plaintext = new Plaintext("hello!");

        System.out.println("Plaintext:\t" + plaintext.getPlaintext());
        System.out.println("Length:\t\t" + plaintext.length);

        System.out.println("Input:\t\t" + "4");
        OTP otp = new OTP(4);
        System.out.println("OTP:\t\t" + otp.getOtp());

        System.out.println("Input:\t\t" + "004231");
        otp = new OTP("0042 31");
        System.out.println("OTP:\t\t" + otp.getOtp());
    }
}
