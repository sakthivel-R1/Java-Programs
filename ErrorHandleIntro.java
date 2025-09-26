class AgeException extends Exception {
}
public class ErrorHandleIntro {
	static void checkAge(int age) throws AgeException {
		if (age< 18) {
			throw new AgeException();
		} else {
			System.out.println("Elegible to vote");
			
		}
	}
	public static void main(String[] args) {
		try {
			//int age = 15;
			checkAge(18);
		} catch(AgeException e) {
			System.out.println("Not eligible to vote");
		} finally {
		    System.out.println("Finally block excecuted");
		}
	}
}  
