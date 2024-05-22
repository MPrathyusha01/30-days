import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int Original = num;
        int reverse = 0;
        int digit=0;

        while(num>0){
            digit = num%10;
            reverse = reverse*10+digit;
            num = num/10;
        }
        if(Original==reverse){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not a palndrome");
        }
    }
}
