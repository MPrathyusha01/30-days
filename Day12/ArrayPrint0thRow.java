package Day12;

import java.util.*;

public class ArrayPrint0thRow {
    public static void main(String args[]) {

        //Scanner scr = new Scanner(System.in);
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int col = 0; col < arr[0].length; col++) {
            System.out.println(arr[0][col]);
        }
    }
}
