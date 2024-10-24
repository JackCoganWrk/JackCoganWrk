import java.util.*;
public class Ciphers {

    void Caesar() {
        int searchCharNum =0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter text");
        String plaintext = s.nextLine();
        System.out.println("Enter search character");
        String userChar = s.nextLine();
        char searchChar = userChar.charAt(0);
        char[] textEncode = new char[plaintext.length()];
        System.out.println(textEncode.length);
        for (int i = 0; i < textEncode.length; i++) {
            textEncode[i] = plaintext.charAt(i);
            System.out.println(textEncode);
            System.out.println();

        }
        System.out.println(plaintext.indexOf(searchChar));
        searchCharNum = searchCharNum + 1;
        String regex = String.valueOf((plaintext.indexOf(searchChar)));
        String [] charArray = plaintext.split(regex);
        System.out.println(Arrays.toString(charArray));
        System.out.println(searchCharNum);
    }
}
