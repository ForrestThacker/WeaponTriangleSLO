package wtController;

import java.util.Scanner;

public class wtController 
{	public static void main(String[] args){
	
	WTModel = new WTModel();
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Axe, Sword, Lances... Fight! (Type AXE, SWORD, or LANCE");
	String playerChoice = scanner.nextLine().toUpperCase();
	
	String computerChoice = WTmodel.getRandomChoice();
	
	System.out.println("You chose " + playerChoice + ".");
	System.out.println("The opponent chose " + computerChoice + ".");
	
	WTModel.GameOutcome outcome = WTmodel.getGameOutcome(playerChoice, computerChoice);
	
	if(outcome == WTModel.GameOutcome.WIN)
	{
		System.out.println("You beat your opponent!");
	}
	else if(outcome == WTModel.GameOutcome.LOSE)
	{
		System.out.println("The opponent won!");
	}
	else{
		System.out.println("The fight was a tie!");
	}
	
		scanner.close();
	}
}
