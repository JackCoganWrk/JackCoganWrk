import java.util.Scanner;
public class Griddy {


    public void Griddy() {

        int r = 0;
        int c = 0;
        int[][] NCBoard = new int[r][c];
        for (r = 0; r < 3; r = r + 1) {
            Scanner s = null;
            for (c = 0; c < 3; c = c + 1)

                // User picks their team
                s = new Scanner(System.in);
            System.out.print("Enter 1 for Crosses, 2 for Noughts");
            int team = s.nextInt();
            if (team == 1) {
                System.out.println("You are Crosses");
            } else {
                System.out.println("You are Noughts");
            }

            // User selects their first position
            int yaxis = 0;
            int xaxis = 0;
            if (team == 1) {
                System.out.print("Enter an X-Coordinate from 1 to 3");
                xaxis = s.nextInt();
                if (xaxis > 3) {
                    System.out.print("Invalid input");
                } else if (xaxis < 1) {
                    System.out.print("Invalid input");
                }
                System.out.print("Enter an Y-Coordinate from 1 to 3");
                yaxis = s.nextInt();
                yaxis = s.nextInt();
                if (yaxis > 3) {
                    System.out.print("Invalid input");
                } else if (yaxis < 1) {
                    System.out.print("Invalid input");
                }
            }

            // Program processes the move
            Object xaxis1 = xaxis;
            Object yaxis1 = yaxis;
        }
    }
}
















