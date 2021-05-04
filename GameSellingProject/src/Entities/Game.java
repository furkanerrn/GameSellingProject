package Entities;


public class Game {

private int gameId;
private String gameName;
private String categoryName;
private double  price;
private String company;

public Game() {
	
}

public Game(int gameId,String gameName, String categoryName, double price, String company) {
	super();
	this.gameName = gameName;
	this.categoryName = categoryName;
	this.price = price;
	this.company = company;
	this.gameId=gameId;
}


public int getGameId() {
	return gameId;
}

public void setGameId(int gameId) {
	this.gameId = gameId;
}

public String getGameName() {
	return gameName;
}
public void setGameName(String gameName) {
	this.gameName = gameName;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}

}
