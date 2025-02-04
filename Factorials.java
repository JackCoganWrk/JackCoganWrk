import java.util.Scanner;

public class Factorials {

    static void factorials () {

        //User enters number
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to factorial");
        int userNum = s.nextInt();


        int factorial  = userNum;
        while (factorial > 0) {
            int factorialNum = userNum * factorial;
            factorial--;
            System.out.println(factorialNum);
        }

    }
}
