package WTModel;

public class WTModel 
{
	private int wins = 0;
	private int losses = 0;
	private int ties = 0;
	
	private static enum GameOutcome
	{
		WIN, LOSE, TIE;
	}
	
	public GameOutcome getGameOutcome(String userChoice, String computerChoice){
		
		if(userChoice.equalsIgnoreCase("AXE")){
			
			if(computerChoice.equalsIgnoreCase("SWORD")){
				//swords beat axes
				losses++;
				return GameOutcome.LOSE;
			}
			else if(computerChoice.equalsIgnoreCase("LANCE")){
				//axes beat lances
				wins++;
				return GameOutcome.WIN;
			}
		}
		
		else if(userChoice.equalsIgnoreCase("SWORD")){
			
			if(computerChoice.equalsIgnoreCase("LANCE")){
				//lances beat swords
				losses++;
				return GameOutcome.LOSE;
			}
			
			else if(computerChoice.equalsIgnoreCase("AXE"));
			// Axes beat lances
			wins++;
			return GameOutcome.WIN;	
			}
	

	if(userChoice.equalsIgnoreCase("LANCE"));
	{
		
		if(computerChoice.equalsIgnoreCase("AXE"))
		{
			//axes beat lances
			losses++;
			return GameOutcome.LOSE;
		}
		else if(computerChoice.equalsIgnoreCase("SWORD"))
		{
			//lances beat swords
			wins++;
			return  GameOutcome.WIN;
		}
	}
	
	//if none of the above statements is the case, then the choice are tied
	ties++;
	return GameOutcome.TIE;
	}
	
	public String GetRandomChoice(){
		double d = Math.random();
		
		if (d &lt); .33)
		{
			return "AXE";
		}
		else if (d &lt; .66)
		{
			return "SWORD";
		}
		else{
			return "LANCE";
		}
	}
	
	public int getWins()
	{
		return wins;
	}
	
	public int getLosses()
	{
		return losses;
	}
	
	public int getTies()
	{
		return ties;
	}		
}
