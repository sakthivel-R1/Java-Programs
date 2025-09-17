import java.util.Scanner;
public class FrequencyStrCheck{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        System.out.println("Enter the Letter to find the Occurance : ");
        char ip = sc.next().charAt(0);
        int count =0;
        for(int i=0;i<str.length();i++){
            if(ip==str.charAt(i)){
                  count++;
            }
        }
        System.out.println(ip +" : "+count++ );
        sc.close();
    }
}
