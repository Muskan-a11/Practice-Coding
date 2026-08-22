package PracticeSetII.Two_pointer;

import java.util.Scanner;

public class remove_duplicates {
    
    public  static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i< arr.length;i++){
        arr[i] = sc.nextInt();
      }
      System.out.println(duplicates(arr));
      sc.close();
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static int duplicates(int[] nums){
            int l = 0;
            for(int r = 1;r < nums.length;r++){
                if(nums[r] != nums[l]){
                    l++;
                    nums[l] = nums[r];
                }
            }
            return l+1;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
