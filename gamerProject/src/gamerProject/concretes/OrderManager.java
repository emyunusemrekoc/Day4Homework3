package gamerProject.concretes;

import gamerProject.abstracts.OrderService;
import gamerProject.entities.Campaign;
import gamerProject.entities.Game;
import gamerProject.entities.Gamer;
import gamerProject.entities.Order;

public class OrderManager implements OrderService {

	@Override
	public void buy(Gamer gamer, Game game) {
		
		Order order = new Order();
		order.setId(1);
		order.setCount(2);
		order.setGameId(1);
		order.setGamerId(1);
		order.setAmountOfPayment(order.getCount()*game.getPrice());
		order.setTotalAmount(order.getCount()*game.getPrice());
		
		System.out.println("\nSipariþ Detaylarý :\n"+"Adet fiyatý :"+game.getPrice()+" // "+order.getCount()+" Adet Satýn aldýnýz : " +game.getName()+ " // Toplam tutar : "+ order.getTotalAmount());
	}

	@Override
	public void buy(Gamer gamer, Game game, Campaign campaign) {
		double discountAmount = game.getPrice()*(campaign.getDiscountRate()/100);
		double amountOfPayment = (game.getPrice()-discountAmount);
		Order order = new Order();
		order.setId(2);
		order.setCount(4);
		order.setGameId(2);
		order.setGamerId(2);
		order.setCampaignId(campaign.getId());
		order.setDiscountAmount(order.getCount()*discountAmount);
		order.setAmountOfPayment(order.getCount()*amountOfPayment);
		order.setTotalAmount(order.getCount()*amountOfPayment);
		
		System.out.println("\nSipariþ Detaylarý :\n"+"Adet fiyatý :"+game.getPrice()+" // "+campaign.getCampaignName()+" Kampanyasýyla " + order.getCount()+" Adet Satýn aldýnýz : " +game.getName()+" // Ýndirim miktarý :"+order.getDiscountAmount()+" // Toplam tutar : "+ order.getTotalAmount());
		
				
				
	}

	
}
