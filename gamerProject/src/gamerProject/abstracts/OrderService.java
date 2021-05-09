package gamerProject.abstracts;

import gamerProject.entities.Campaign;
import gamerProject.entities.Game;
import gamerProject.entities.Gamer;

public interface OrderService {
	void buy(Gamer gamer,Game game);

	void buy(Gamer gamer,Game game,Campaign campaign);

}
