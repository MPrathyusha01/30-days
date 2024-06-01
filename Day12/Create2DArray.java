package Day12;
import java.util.*;
public class Create2DArray {
    public static void main(String args[]){
        Scanner scr = new Scanner(System.in);
        int num1 = scr.nextInt();
        int num2 = scr.nextInt();
        //scr.close();
        int[][] arr = new int[num1][num2];
        for(int row=0; row<num1;row++){
            for(int col = 0;col<num2; col++){
                arr[row][col] = scr.nextInt();
            }
        }
        for(int[] row:arr){
        System.out.println(Arrays.toString(row));
        }
    }
}
