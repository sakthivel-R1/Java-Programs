import java.util.Scanner;

public class StringPalindrome {
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to find Vowels: ");
        String str = sc.nextLine();
        String temp="";
        int s= str.length();
   
        for(int i=s-1;i>=0;i--){
        
              temp += str.charAt(i);
             
               
       }
       if(temp.contains(str)){
            System.out.println("Palindrome");
       }
        else{
             System.out.println("Not a Palindrome");
    }
    sc.close();
 }
}
