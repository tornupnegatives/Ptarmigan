public class PhenotypeTest {

    public static void main(String[] args){

        System.out.println("Input:\t\t \"hello!\"");
        Plaintext plaintext = new Plaintext("hello!");

        System.out.println("Plaintext:\t" + plaintext.getPlaintext());
        System.out.println("Length:\t\t" + plaintext.length);

        System.out.println("Input:\t\t" + "22");
        OTP otp = new OTP(22);
        System.out.println("OTP:\t\t" + otp.getOtp());
    }
}
