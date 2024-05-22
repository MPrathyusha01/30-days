import java.util.*;
public class CountOfDigit {
    public static void main(String args[]){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int count = 0;
        int digit = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
}
