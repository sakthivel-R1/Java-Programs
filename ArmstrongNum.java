import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Number To check Armstrong : ");

       int num = sc.nextInt();
       int numDup=num;
       int sum=0;
       int count=0;
       int squre=0;
       
       int single =0;

       if(num<0){
           System.out.print("Invalid Input..!");
           sc.close();
           return;
       }

       while(numDup!=0){
           numDup =numDup/10;
           count++;
       }
       numDup=num;
       while((numDup!=0)&&(count==2)){
            single = numDup%10;
            squre = single*single;
            sum +=squre;
            numDup=numDup/10;
           
        }
        numDup=num;
        while((numDup!=0)&&(count==3)){
            single = numDup%10;
            squre = single*single*single;
            sum +=squre;
            numDup=numDup/10;
          
        }
        if(num==sum){
            System.out.println("ArmstrongNumber");
        }else{
            System.out.println("Not a ArmstrongNumber");
        }
        sc.close();
    }
}
