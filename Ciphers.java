import java.util.Scanner;
public class Ciphers {

    void Caesar() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter text");
        String plaintext = s.nextLine();
        char[] textEncode = new char[plaintext.length()];
        for (int i = 0;i < textEncode.length;i++) {
            textEncode[i] = plaintext.charAt(i);
            System.out.println(textEncode);
        }
        System.out.println("Enter search character");
        String userChar = s.nextLine();
        public int
        System.out.println(textEncode.indexOf(userChar));
    }
}