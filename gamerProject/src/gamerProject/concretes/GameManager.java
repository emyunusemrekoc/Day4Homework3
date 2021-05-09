package gamerProject.concretes;

import gamerProject.abstracts.GameService;
import gamerProject.entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi :"+game.getName()+" "+game.getPrice());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun bilgisi g�ncellendi :"+game.getName()+" "+game.getPrice());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi :"+game.getName()+" "+game.getPrice());
		
	}

}
