package wtView;

import WTModel.WTModel;

public class VTView 
{ 

public static void main(String [] args){
	
	WTModel model = new WTModel();
	
	String choice = model.getRandomChoice();
	
	System.out.println(choice);
	}
}