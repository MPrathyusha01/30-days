import java.util.*;
public class FactorialOfN {
    public static void main(String args[]) {
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        long fact = 1;

        for(int i=1; i<=num;i++){
            fact = fact*i;
        }
        System.out.print(fact);

    }
}
