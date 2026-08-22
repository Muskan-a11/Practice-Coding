package PracticeSetII.Two_pointer;
import java.util.*;
//input array is not sorted ---------> HASHMAP
class TwoSumI {
    public static int[] twosum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans[] = twosum(nums,target);
        System.out.println(ans[0]+" "+ans[1]);
        sc.close();
    }
}