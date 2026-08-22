package PracticeSetI.HackerRank;
import java.util.*;
public class reverse_array {
    public static void main(String[] args){
        // we can use arraylist as weel but here we are using array to store the values and then print them in reverse order
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
            
        }
sc.close(); 
    }
}

