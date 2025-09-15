
import java.util.Scanner;
public class ArrayIndexCheck{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.print("Enter the Array Size : ");
	    int size = sc.nextInt();
	    int []arr = new int[size];
	    int indexValue=0;
	    System.out.println("Enter the Array Elements : ");
	    
	    for (int i=0;i<size;i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    System.out.println("Enter value to find Index Number : ");
	    int value = sc.nextInt();
	    
	    for (int j=0;j<size;j++){
	        if(arr[j]==value){
	           indexValue = j;
	        }
	   }
	   System.out.print("The Index is : "+indexValue);
	   
	   sc.close();
		}
}
