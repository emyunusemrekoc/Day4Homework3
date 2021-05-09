package gamerProject.concretes;

import gamerProject.abstracts.GamerCheckService;
import gamerProject.abstracts.GamerService;
import gamerProject.entities.Gamer;

public class GamerManager implements GamerService{

	private GamerCheckService gamerCheckService;
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)==true) {
			System.out.println("Oyuncu eklendi :" + gamer.getFirstName()+" "+gamer.getLastName());
		}else {
			System.out.println("Oyuncu eklenemedi hatalý giriþ !");
		}
		
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi : " +gamer.getFirstName()+" "+gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi : " +gamer.getFirstName()+" "+gamer.getLastName());		
	}


}
