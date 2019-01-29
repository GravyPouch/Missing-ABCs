package projecto;

import java.util.*;

public class Alphabet {
	//Sets some varibles to 0 for use later
	int x = 0;
	int y = 0;
	int z = 0;
	//String that contains the alphabet
	String other = new String ("abcdefghijklmnopqrstuvwxyz");
	
	void whatsMissing(){
		//Defines a new Stringbuilder
		StringBuilder glue = new StringBuilder();
		System.out.println("Give me a word");
        Scanner console = new Scanner(System.in);
		//prombts user for text
        String suckytext = console.nextLine();
		//converts it into lowercase
        String text = suckytext.toLowerCase();
		//prints the new lowercase text
		System.out.println(text);
		//checks the legth of the users text
		int length = text.length();
		System.out.println("length is "+length);
		System.out.println("----------------");
		System.out.println("The text does not contain: ");
		//Starts a for loop to interate on the y variable.
		//It ends at 25 becuase that is how long the alphabet is.
		for (int y=0; y <= 25; y++) {
			//converts the letter to a string
			String letter = Character.toString(other.charAt(y));
			//checks if the user's text contains the letter
		if (text.contains(letter)) {
			//If it does. It does a whole lot of nothing
		}
		else{
			//Appends the letter
			glue.append(letter);
		}
	}
		//Defines a new string from the charectars
		String fulltext = glue.toString();
		//Prints the new String
		System.out.println(fulltext);
	}
//this just runs the script
	public static void main(String[] args) {
		
		Alphabet run = new Alphabet();
	    run.whatsMissing();
		
		
	}	
	
}
