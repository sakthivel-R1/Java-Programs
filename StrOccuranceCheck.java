import java.util.*;
public class StrOccuranceCheck
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		
		System.out.print("Enter the Word to check  : ");
		String check = sc.nextLine();
		boolean result = str.contains(check);
		
		System.out.println(result);
		sc.close();
	}
}
