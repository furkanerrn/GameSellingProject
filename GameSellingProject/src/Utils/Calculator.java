package Utils;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Calculator {
	
	
public static double calculate(Game game,Campaign campaign) {
	double price=game.getPrice()-game.getPrice()*campaign.getRatioOfDiscount()/100;
	return price;
	
}


}
