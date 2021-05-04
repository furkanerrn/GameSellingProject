package Utils;

import Concrete.CustomerCheckManager;

import Entities.Gamer;

public class Validation {
	
 public static void validate(Gamer gamer) {
	 CustomerCheckManager checkManager=new CustomerCheckManager();
	var res= checkManager.eDevletDogrulamasi(gamer);
	 if (res==true) {
		 System.out.println(gamer.getName()+" was approved by system");
	}else {
		System.out.println("User doesnt exist");
	}
 }
}
