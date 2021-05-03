package Interfaces;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface IGameService {
	void add(Game game);
	void delete(Game game);
	void update(Game game);
	void gameSale(Game game, Gamer gamer, Campaign campaign);
	void discountGame(Game game, Campaign campaign);
}
