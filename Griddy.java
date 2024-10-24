import java.util.Scanner;

import static java.util.Arrays.deepToString;

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

            if (team == 1) {
                int xaxis;
                int yaxis;
                System.out.print("Enter an X-Coordinate from 1 to 3");
                xaxis = s.nextInt();
                if (xaxis > 3) {
                    System.out.print("Invalid input");
                } else if (xaxis < 1) {
                    System.out.print("Invalid input");
                }
                System.out.print("Enter an Y-Coordinate from 1 to 3");
                yaxis = s.nextInt();
                if (yaxis > 3) {
                    System.out.print("Invalid input");
                } else if (yaxis < 1) {
                    System.out.print("Invalid input");
                }
                int xaxis1 = xaxis;
                int yaxis1 = yaxis;
                NCBoard[xaxis1][yaxis1] = team;
                deepToString(NCBoard);
                System.out.println(NCBoard[xaxis1][yaxis1]);
            }
        }
    }
}
















