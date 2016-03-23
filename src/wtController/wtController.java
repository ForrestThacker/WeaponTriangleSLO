package wtController;

import java.util.Scanner;

import wtModel.WTModel;
import wtModel.WTModel.GameOutcome;

public class WTController 
{	public static void main(String[] args){
	
	WTModel gameModel = new WTModel();
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Axe, Sword, Lances... Fight! Type AXE, SWORD, or LANCE!");
	String playerChoice = scanner.nextLine().toUpperCase();
	
	String computerChoice = gameModel.GetRandomChoice();
	
	System.out.println("You chose " + playerChoice + ".");
	System.out.println("The opponent chose " + computerChoice + ".");
	
	gameModel.result = gameModel.getGameOutcome(playerChoice, computerChoice);
	
	if(gameModel.result == GameOutcome.WIN)
	{
		System.out.println("You beat your opponent!");
	}
	else if(gameModel.result == GameOutcome.LOSE)
	{
		System.out.println("The opponent won!");
	}
	else{
		System.out.println("The fight was a tie!");
	}
	
		scanner.close();
	}
}
