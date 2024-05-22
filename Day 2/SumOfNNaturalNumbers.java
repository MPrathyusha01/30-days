import java.util.*;
public class SumOfNNaturalNumbers {
    public static void main(String args[]){
        Scanner scr = new Scanner(System.in);
        int N = scr.nextInt();
        int sum = 0;
        for(int i=1; i<=N;i++){
            sum+=i;
        }
        System.out.print(sum);
    }
}
