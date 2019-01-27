package projecto;

import java.util.*;

public class Alphabet {
	int x = 0;
	int y = 0;
	int z = 0;
	String other = new String ("abcdefghijklmnopqrstuvwxyz");
	
	void whatsMissing(){
		System.out.println("Give me a word");
        Scanner console = new Scanner(System.in);
        String suckytext = console.nextLine();
        String text = suckytext.toLowerCase();
		System.out.println(text);
		int length = text.length();
		System.out.println("length is "+length);
		System.out.println("----------------");
		System.out.println("The text does not contain: ");
		for (int y=0; y <= 25; y++) {
			String letter = Character.toString(other.charAt(y));
		if (text.contains(letter)) {
	
			
			
		}
		else{
			System.out.print(letter);
			

		}
		
	}
	}
	

	
		

	public static void main(String[] args) {
		
		Alphabet run = new Alphabet();
	    run.whatsMissing();
		
		
	}	
	
}
