package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{
	Campaign[] campaignes;

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " was created");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " was removed");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " was updated");
		
	}

}
