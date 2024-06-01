package Day12;
import java.util.*;
public class Create2DarrayList {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> d1 = new ArrayList<>();  
        d1.add(1);  
        d1.add(1);  
        d1.add(1);  
        d1.add(1);  
        ArrayList<Integer> d2 = new ArrayList<>();   
        d2.add(2); 
        d2.add(2); 
        d2.add(2); 
        d2.add(2); 
        ArrayList<Integer> d3 = new ArrayList<>();  
        d3.add(3);  
        d3.add(3);  
        d3.add(3);  
        d3.add(3);
        
        arr.add(d1);
        arr.add(d2);
        arr.add(d3);

        System.out.println(arr);
    }
}
