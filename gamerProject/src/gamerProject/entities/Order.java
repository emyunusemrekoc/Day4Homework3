package gamerProject.entities;

import gamerProject.abstracts.Entity;

public class Order implements Entity {
	private int id;
	private int gamerId;
	private int gameId;
	private int campaignId ;
	private int count;
	private double totalAmount;
	private double discountAmount;
	private double amountOfPayment;
	
	public Order() {
		
	}

	public Order(int id, int gamerId, int gameId, int campaignId, int count, double totalAmount, double discountAmount,
			double amountOfPayment) {
		super();
		this.id = id;
		this.gamerId = gamerId;
		this.gameId = gameId;
		this.campaignId = campaignId;
		this.count = count;
		this.totalAmount = totalAmount;
		this.discountAmount = discountAmount;
		this.amountOfPayment = amountOfPayment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}

	public double getAmountOfPayment() {
		return amountOfPayment;
	}

	public void setAmountOfPayment(double amountOfPayment) {
		this.amountOfPayment = amountOfPayment;
	}

	

}
