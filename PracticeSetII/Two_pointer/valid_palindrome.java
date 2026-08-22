package PracticeSetII.Two_pointer;
import java.util.*;
class valid_palindrome{
         public static boolean palin(String s){
                 int left = 0;
                 int right = s.length()-1;
                 while(left < right){
                    while(left < right && !Character.isLetterOrDigit(left)){
                        left++;
                    }
                    while(left < right && !Character.isLetterOrDigit(right)){
                        right--;
                    }
                    if(Character.toLowerCase(left) != Character.toLowerCase(right)){
                        return false;
                    }
                    left++;
                    right--;
                 }
                 return true;

         }
         public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            System.out.println(palin(s));
            sc.close();
         }
}