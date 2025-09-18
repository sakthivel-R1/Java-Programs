class LargeDigit
{
    public static int display()
    {
        int num = 78534;
        int digit = 0;
        int large=0;
        while(num!=0)
        {
            digit = num%10;
            if(digit>large)
            {
                 large = digit;
            } 
            num/=10;
            
        }
        return large;
        
    }
        
}
public class LargestDigit
{
	public static void main(String[] args) {
		System.out.println(LargeDigit.display());
	}
}