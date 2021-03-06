package gamerProject.entities;

import gamerProject.abstracts.Entity;

public class Campaign implements Entity {
	private int id;
	private String campaignName;
	private double discountRate;

	public Campaign() {

	}

	public Campaign(int id, String campaignName, double discountRate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

}
