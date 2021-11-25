import java.util.ArrayList;
import java.util.Random;

public class Helpers {
    public static Random rand = new Random();

    public static void fill2DIntArray(int[][] array, int value) {
        for (int i = 0; i < array.length; i++)
            for (int k = 0; k < array[i].length; k++)
                array[i][k] = value;
    }

    public static void print2DIntArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();

            for (int k = 0; k < array[i].length; k++) {
                //System.out.print(array[i][k] + " ");
                //System.out.printf("%04d ", array[i][k]);
                int val = array[i][k];
                if (val > 0)
                {
                    System.out.printf("░░");
                }
                if (val < 0 && val > -50)
                {
                    System.out.printf("▒▒");
                }
                if (val < - 50)
                {
                    System.out.printf("▓▓");
                }
            }
        }

        System.out.println();
    }

    public static void printShortestPath(ArrayList<Position> shortestPath) {
        for (int i = 0; i < shortestPath.size(); i++) {
            System.out.printf("\nstep %s\n", i);
            System.out.println(shortestPath.get(i));
        }

        int outArr[][] = new int[10][10];
        //
        for (int i = 0; i < shortestPath.size(); i++)
        {
            Position pathPos = shortestPath.get(i);
            int x = pathPos.getRow();
            int y = pathPos.getCol();
            outArr[x][y] = i + 1;
        }

        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if (outArr[10 - i - 1][j] == 0)
                {
                    System.out.printf("░░");
                }
                else
                {
                    System.out.printf("%02d", outArr[10 - i - 1][j]);
                }
            }
            System.out.printf("\n");
        }
    }

    public static void printQValues(double[][][] qTable) {
        for (int i = 0; i < qTable.length; i++) {
            for (int k = 0; k < qTable[i].length; k++) {
                System.out.printf("Q Values for row: %s, col %s\n", i, k);
                for (int h = 0; h < qTable[i][k].length; h++)
                    System.out.printf("%s: %s\n", h, qTable[i][k][h]);

                System.out.print("\n\n");
            }
        }

    }
}
