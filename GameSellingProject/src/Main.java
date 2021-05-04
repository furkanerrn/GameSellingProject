import Concrete.CampaignManager;
import Concrete.CustomerCheckManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Utils.Validation;

public class Main {

	public static void main(String[] args) {
		Gamer Furkan=new Gamer("1", "Furkan", "Eren", "Turkey", "İstanbul", 21,12);
		GamerManager gamerManager=new GamerManager();
		gamerManager.add(Furkan);
		Validation.validate(Furkan);
		
		System.out.println("");
		CustomerCheckManager checkManager=new CustomerCheckManager();
		
		Gamer Engin=new Gamer("2", "Engin", "Demirog", "Turkey","Diyarbakır",37,8 );
		gamerManager.add(Engin);
		Validation.validate(Engin);
		
		Gamer Ersin=new Gamer("3", "Nick", "Lamb", "Spain", "Madrid", 31, 7);
		System.out.println("");
		
		Game farCry3=new Game(1,"Farcry 3", "War", 10, "Ubisoft");
		GameManager gameManager=new GameManager();
		gameManager.add(farCry3);
		
		System.out.println("");
		
		Gamer[] gamers= {Furkan,Engin};
		
		Game csGo=new Game(2, "Cs Go", "War", 15, "Valve");
		gameManager.add(csGo);
		
		Game pubGame=new Game(3, "Pubg ", "Survival Game", 87, "Tencent Games");
		gameManager.add(pubGame);
		Game[] games= {farCry3,csGo,pubGame};
		
		for (Game gameInfo : games) {
			System.out.println("**Library**");
		System.out.println("Game Id: "+gameInfo.getGameId());
		System.out.println("Game name: "+gameInfo.getGameName());
		System.out.println("Category: "+gameInfo.getCategoryName());
		System.out.println("Price :"+gameInfo.getPrice());
		System.out.println("------");
		}
		System.out.println("**Library**");
		
		Campaign ilkindirim=new Campaign(1, "Ayak alıştıran indirim", 20);
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(ilkindirim);
		
		System.out.println("");
		
		Campaign furkanlaraozelindirim=new Campaign(2,"Adı furkan olanlara özel indirim",35);
		campaignManager.add(furkanlaraozelindirim);
		
		
		System.out.println("");
		
		System.out.println("** Purchase Process**");
		SaleManager manager=new SaleManager();
		manager.selling(Engin, farCry3, ilkindirim);
		manager.selling(Furkan, pubGame, furkanlaraozelindirim);
	}

}
