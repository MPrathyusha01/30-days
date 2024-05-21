import java.util.*;

public class FibonacciSeries {
    public static void main(String args[]) {
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int a = 0;
        int b = 1;
        int next = 0;
        if (num == 0 || num == 1)
            System.out.println(num);
        else {
            System.out.print(a + " " + b + " ");

            for (int i = 2; i < num; i++) {
                next = a + b;
                System.out.print(next + " ");
                a = b;
                b = next;
            }
        }
    }
}
