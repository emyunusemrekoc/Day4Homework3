package gamerProject;

import java.time.LocalDate;

import gamerProject.adapters.MernisCheckAdapter;
import gamerProject.concretes.CampaignManager;
import gamerProject.concretes.GameManager;
import gamerProject.concretes.GamerManager;
import gamerProject.concretes.OrderManager;
import gamerProject.entities.Campaign;
import gamerProject.entities.Game;
import gamerProject.entities.Gamer;

public class Main {

	public static void main(String[] args) {

		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("Engin");
		gamer1.setLastName("Demiroð");
		gamer1.setNationalityId("28861499108");
		gamer1.setBirthOfDate(LocalDate.of(1985, 1, 5));

		GamerManager gamerManager = new GamerManager(new MernisCheckAdapter());
		gamerManager.add(gamer1);

		Campaign yuzde10 = new Campaign();
		yuzde10.setId(1);
		yuzde10.setCampaignName("Yüzde 10 Kampanyasý");
		yuzde10.setDiscountRate(10);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(yuzde10);

		Game csGo = new Game();
		csGo.setId(1);
		csGo.setName("CS GO");
		csGo.setPrice(1000);
		
		GameManager gameManager = new GameManager();
		gameManager.add(csGo);

		OrderManager orderManager = new OrderManager();
		// orderManager.buy(gamer1, csGo);
		orderManager.buy(gamer1, csGo, yuzde10);

//	ÇIKTILAR
//		Kiþisel veriler doðrulandý.
//
//		Oyuncu eklendi :Engin Demiroð
//		Kampanya eklendi :kampanya Id =1 Yüzde 10 Kampanyasý :%10.0
//		Oyun eklendi :CS GO 1000
//
//		Sipariþ Detaylarý :
//		Adet fiyatý :1000 // Yüzde 10 Kampanyasý Kampanyasýyla 4 Adet Satýn aldýnýz : CS GO // Ýndirim miktarý :400.0 // Toplam tutar : 3600.0


	}

}
