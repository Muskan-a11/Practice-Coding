package PracticeSetII.Two_pointer;
import java.util.*;

public class max_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0;i < n;i++){
            if(arr[i] > max){
                second = max;
                max = arr[i];
            }
            else if(arr[i] > second){
             second = arr[i];
            }
        }
        

        System.out.println(second);
        sc.close();
    }
}
