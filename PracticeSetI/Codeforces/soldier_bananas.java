package PracticeSetI.Codeforces;

import java.util.*;
public class soldier_bananas {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int totalamt = 0;
        for(int i = 1;i <= w;i++){
            totalamt += i * k;
        }
        int ans = totalamt - n;
        if(ans < 0){
            ans = 0;
        }
        System.out.println(ans);
        sc.close();
}
}
