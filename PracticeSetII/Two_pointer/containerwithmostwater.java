package PracticeSetII.Two_pointer;
import java.util.*;
public class containerwithmostwater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height[] = new int[n];
        for(int i = 0;i<n;i++){
            height[i] = sc.nextInt();
        }
        System.out.println(maxarea(height));
        sc.close();
    }
    public static  int maxarea(int[] height){
            // brute force
            // int max = 0;
            // for(int i = 0;i < height.length;i++){
            //     for(int j = i+1;j< height.length;j++){
            //         int length = Math.min(height[i],height[j]);
            //         int width = j-i;
            //         int area = width * length;
            //         max = Math.max(area,max);
            //     }
            // }
            // return max;

  // two pointer approach
        int max = 0;
        int left = 0;
        int right = height.length -1;
        while(left  < right){
            int minheight = Math.min(height[left],height[right]);
            int width = right -left;
            int area = width * minheight;
            max = Math.max(area,max);
            if(height[left] < height[right]) left++;
            else right--;
        }
        return max;
    }
}
