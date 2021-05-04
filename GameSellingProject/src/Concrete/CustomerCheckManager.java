package Concrete;

import Abstract.CustomerCheckService;
import Entities.Gamer;


public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean eDevletDogrulamasi(Gamer gamer) {
		if (gamer.getId()=="0" ||gamer.getName()=="") {
			return false;
		}else {
			return true;
		}
		
	}

}
