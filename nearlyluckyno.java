import java.util.*;
class nearlyluckyno{
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
            int digit = n % 10;
            if(digit == 4 || digit == 7){
                count++;
            }
            n = n/10;
        }
        if(count == 0) 
            {
            System.out.println("No");
              return;
            }
        while(count > 0){
            int digit = count % 10;
            if(digit != 4 && digit != 7){
                System.out.println("No");
                break;
            }
            count = count /10;
        }
        System.out.println("Yes");
        sc.close();
        }
    }git 
