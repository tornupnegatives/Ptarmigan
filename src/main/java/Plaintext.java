import java.util.ArrayList;

public class Plaintext {

    private ArrayList<Integer> plaintext;
    protected int length;

    public Plaintext(String usr_txt){

        // Converts user input to all-caps and ASCII
        plaintext = convertTxt(usr_txt.toUpperCase());

        convertAndValidate();

        length = plaintext.size();


    }

    private ArrayList<Integer> convertTxt(String txt){

        char[] tmp_char_array = txt.toCharArray();
        ArrayList<Integer> tmp_int_array = new ArrayList<>();

        for(char letter : tmp_char_array)
            tmp_int_array.add((int)letter);

        return tmp_int_array;
    }

    private void convertAndValidate(){

        // Convert
        for(int count = 0; count < plaintext.size(); count++){

            plaintext.set(count, asciiTo123(plaintext.get(count)));
        }

        // Validate
        for(int count = 0; count < plaintext.size(); count++){
            if(plaintext.get(count)==-1) {
                plaintext.remove(count);
                count--;
            }
        }
    }

    private Integer asciiTo123(int num){

        if(num >= 65 && num <= 90)      // When num corresponds to A-Z (1-26)
            return num-64;
        else if(num >= 48 && num <= 57) // When num corresponds to 0-9 (30-39)
            return num-18;
        else if(num == 32)              // Space
            return 0;
        else if(num == 44)              // ,
            return 41;
        else if(num == 46)              // .
            return 42;
        else
            return -1;
    }

    public ArrayList<Integer> getPlaintext() {
        return plaintext;
    }

    public int getPlaintextAt(int num) {
        return plaintext.get(num);
    }


}
