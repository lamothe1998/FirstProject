import java.util.scanner;

public class W3E1 {
	private static Scanner scan = new Scanner(System.in); 
	public static void main(String[] args) {
		
		int max = 10;
		int min = 0; 
		int randomNumber = generateNumber(max, min);
		while(!checkGuess(getGuess(min,max),randomNumber)) {}
		scan.close(); 
	}
	
	private static int generateNumber(int max, int min) {
		return (int)(Math.random()*(max-min+1))+min;
	}
	
	private static int getGuess(int min, int max) {
		
		System.out.println("Guess a number between "+min+" and "+max);
		
		
		while(!scan.hasNextInt()) {
			scan.nextLine(); 
			System.out.println("Please input a number.");
		}
		
		return scan.nextInt();  
	}
	
	
	private static boolean checkGuess(int guess, int target) {
		if(guess<target) {
			System.out.println("Too Low");
			return false; 
		}else if(guess> target) {
			System.out.println("Too High");
			return false;
		}else {
			System.out.println("You got it!");
			return true; 
		}
	}
}
