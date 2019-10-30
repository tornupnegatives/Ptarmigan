public class PhenotypeTest {

    public static void main(String[] args){

        Plaintext plaintext = new Plaintext("hello!");
        OTP otp = new OTP("1111");

        System.out.println("Plaintext:\t\t" + plaintext.getPlaintext());
        System.out.println("OTP:\t\t\t" + otp.getOTP());

        Ciphertext ciphertext = new Ciphertext(plaintext, otp);
        System.out.println("Ciphertext:\t\t" + ciphertext.getCiphertext());
    }
}
