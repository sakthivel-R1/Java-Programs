import java.util.Scanner;
public class Palindrome {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to Check Palindrome : ");
        int num = sc.nextInt();

        int numDup=num;
        
        int reversed = 0;
        if(numDup>0){
            while(numDup!=0){
                reversed =reversed*10+ numDup%10;
                numDup=numDup/10;
            }
            
        }
        if(reversed==num){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
