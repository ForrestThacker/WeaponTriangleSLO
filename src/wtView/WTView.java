package wtView;

import wtModel.WTModel;

public class WTView 
{ 

public static void main(String [] args){
	
	WTModel model = new WTModel();
	
	String choice = model.GetRandomChoice();
	
	System.out.println(choice);
	}
}