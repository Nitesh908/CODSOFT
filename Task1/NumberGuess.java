package Task1;

import java.util.Scanner;

public class NumberGuess {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
	int totalAttempt= 0;
		
		  boolean playAgain;

	        do {
	            playGame();
	            
	            totalAttempt++;
	            System.out.println("Total no of attempt"+totalAttempt);
	        
	            System.out.print("Do you want to play again? (yes/no): ");
	            String playAgainInput = sc.next().toLowerCase();
	            playAgain = playAgainInput.equals("yes");

	        } while (playAgain);

	        System.out.println("Thanks for playing! Goodbye.");
	       
	    }			
			
			public static void playGame() {
				
				

				int random = (int)((Math.random()*10)+1);
				System.out.println(random);
				
				
	
		
		int attempt=0;
		
		int maxattempt=5;
		
		while(attempt<maxattempt) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			
			
			int number = sc.nextInt();
			
			System.out.println("User Guess number"+ number);
			
			attempt++;
		
		if(number==random) {
			
			System.out.println("Correct the Guess Number");
			
		break;
		
		
		}
		
		else if(number<random) {
			
			System.out.println("is too low ");
		}
		
		else {
			
			System.out.println("is too high");
			
			
		}
		
		}
		
			}
		
		
	    
}



