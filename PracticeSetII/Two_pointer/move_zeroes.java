package PracticeSetII.Two_pointer;
import java.util.*;
class move_zeroes{
  
    static void move(int[] nums){
        int index = 0;
     ////////  //// ////////////////////////////////////////////////////////////////////////////////////////
        for(int i = 0; i <nums.length; i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        while(index < nums.length){
            nums[index] = 0;
            index++;
        }
        ////////////////////////////////////////////////////////////////////////////////////
        for(int k: nums){
            System.out.print(k + " ");
        }
        
    }
    public  static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i< arr.length;i++){
        arr[i] = sc.nextInt();
      }
      move(arr);
      sc.close();
    }
}
