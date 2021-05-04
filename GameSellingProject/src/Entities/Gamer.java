package Entities;


public class Gamer {
	private	String id;
	private	String name;
	private	String surName;
	private	String country;
	private	String city;
	private	int age;
	private	int totalGame;
	
	
	public Gamer(String id, String name, String surName, String country, String city, int age, int totalGame ) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.country = country;
		this.city = city;
		this.age = age;
		this.totalGame = totalGame;
		
	}


    


	public Gamer() {
		
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getTotalGame() {
		return totalGame;
	}
	public void setTotalGame(int totalGame) {
		this.totalGame = totalGame;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
