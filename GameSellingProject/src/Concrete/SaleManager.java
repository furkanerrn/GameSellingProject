package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Utils.Calculator;

public class SaleManager implements SaleService{

	@Override
	public void selling(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getName()+" purhased this game: "+game.getGameName()+" / Normal price :"+game.getPrice()+" / price including campaign: "+Calculator.calculate(game, campaign));
		
	}

}
