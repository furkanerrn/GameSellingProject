package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Game was added: "+game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game was removed: "+game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Info was updated: "+game.getGameName());
		
	}

}
