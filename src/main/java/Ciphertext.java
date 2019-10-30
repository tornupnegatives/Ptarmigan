import java.util.ArrayList;

public class Ciphertext {

    private ArrayList<Integer> ciphertext;

    public Ciphertext(Plaintext ptxt, OTP otp) {

        ciphertext = new ArrayList<>();

        int txt, otp_txt;
        for (int count = 0; count < ptxt.length; count++) {

            txt = ptxt.getPlaintextAt(count);
            otp_txt = otp.getOTPAt(count);

            ciphertext.add(encrypt(txt, otp_txt));
        }
    }

    private Integer encrypt(int txt, int otp_txt) {

        return txt + otp_txt;
    }

    public ArrayList<Integer> getCiphertext() {
        return ciphertext;
    }
}
