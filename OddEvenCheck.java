import java.util.Scanner;

public class OddEvenCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Number : ");

        int num = sc.nextInt();
        if(num>0){
          if(num%2==0){
              System.out.println("EvenNumber");
          }
          else{
              System.out.println("OddNumber");
          }
          sc.close();
        }
        else{
            System.out.println("Invalid Input..!");
        }
    }
}