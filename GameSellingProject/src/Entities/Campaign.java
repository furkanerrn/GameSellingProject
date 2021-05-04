package Entities;


public class Campaign {
	
private int campaignId;

private String campaignName;
private int RatioOfDiscount;



public Campaign() {
	
}

public Campaign(int campaignId, String campaignName, int ratioOfDiscount) {
	super();
	this.campaignId = campaignId;
	this.campaignName = campaignName;
	RatioOfDiscount = ratioOfDiscount;
}


public int getCampaignId() {
	return campaignId;
}
public void setCampaignId(int campaignId) {
	this.campaignId = campaignId;
}
public String getCampaignName() {
	return campaignName;
}
public void setCampaignName(String campaignName) {
	this.campaignName = campaignName;
}
public int getRatioOfDiscount() {
	return RatioOfDiscount;
}
public void setRatioOfDiscount(int ratioOfDiscount) {
	RatioOfDiscount = ratioOfDiscount;
}


}
