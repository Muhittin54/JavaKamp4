package Managers;

import Entities.Campaign;
import Interfaces.ICampaignService;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya Sisteme Eklendi: " + campaign.getName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Sisteden Silindi: " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya Guncellendi: '" + campaign.getName() + "' yeni indirim orani: %" + campaign.getDiscountRate());
		
	}

}
