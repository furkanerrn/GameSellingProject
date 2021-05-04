package Concrete;

import Abstract.GamerService;
import Entities.Gamer;
import Utils.Validation;

public class GamerManager implements GamerService{

	@Override
	public void add(Gamer gamer) {
		
		System.out.println(gamer.getName()+" "+gamer.getSurName()+" was added in the system");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getName()+" "+gamer.getSurName()+" was removed from the system");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getName()+" "+gamer.getSurName()+" user info was updated");
		
	}

}
