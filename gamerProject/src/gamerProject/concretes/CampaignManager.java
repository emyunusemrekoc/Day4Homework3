package gamerProject.concretes;

import gamerProject.abstracts.CampaignService;
import gamerProject.entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi :"+"kampanya Id ="+campaign.getId()+" "+campaign.getCampaignName()+" :%"+campaign.getDiscountRate());
	
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi :"+campaign.getId()+" "+campaign.getCampaignName()+"%"+campaign.getDiscountRate());
		
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi :"+campaign.getId()+" "+campaign.getCampaignName()+"%"+campaign.getDiscountRate());
		
		
	}

}
