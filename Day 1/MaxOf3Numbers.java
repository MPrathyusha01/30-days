import java.util.*;

public class MaxOf3Numbers {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();

        int max = a;

        if (b > max) {
            System.out.println(b);
        } else if (c > max) {
            System.out.println(c);
        } else {
            System.out.println(a);
        }

    }
}