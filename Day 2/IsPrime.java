import java.util.*;
public class IsPrime {
    public static void main(String args[]){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        boolean isPrime = true;
        if(num<=1){
            isPrime = false;
        }else{
            for(int i = 2; i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
                //3isPrime = true;
            }
        
        }
        System.out.println(isPrime);
    }
}
