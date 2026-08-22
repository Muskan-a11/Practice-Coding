package PracticeSetII.Two_pointer;
import java.util.*;
class targetsum{
    public static int[] tsum(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target) return new int[]{left+1,right+1};
            else if(sum< target) left++;
            else right--;
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ans = tsum(arr,target);
        System.out.println(ans[0] +" "+ans[1]);
        sc.close();
    }
}