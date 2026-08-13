package PracticeSetI;
import java.util.Scanner;

public class nextround {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Input from user
        int n = sc.nextInt();
        int k =sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        // Logic to find the number of participants who advance to the next round
        int count = 0;
        for(int i = 0;i < n;i++){
            if(arr[i] >= arr[k-1] && arr[i] > 0){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
        
    }
}
