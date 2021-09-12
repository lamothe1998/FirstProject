public class ExerciseTwo {
	public static void main(String[] args) {
		char[] alph = getAlphabetArray(); 
		
		for(int n = 0; n < alph.length; n++) {
			System.out.println(alph[n]);
		}
	}
	
	public static char[] getAlphabetArray() {
		char[] alph = new char[26];
		char currLetter = 'a';
		int n = 0;
		do {
			alph[n] = currLetter;
			n++; 
			currLetter++;
		}while(n<alph.length && currLetter <= 'z'); 
		
		return alph; 
	}
}
