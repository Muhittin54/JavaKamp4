import java.util.Date;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Managers.CampaignManager;
import Managers.GameManager;
import Managers.GamerManager;
import Validation.ValidationManager;

public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager = new GamerManager(new ValidationManager());
		Gamer gamer = new Gamer(1, "Muhittin", "Mizrak", "15963247", new Date(1995, 8, 8));
		
		
		gamerManager.add(gamer);
		gamerManager.update(gamer);
		gamerManager.delete(gamer);
		
		Gamer gamer1 = new Gamer();
		System.out.println();
		gamerManager.add(gamer1);
		gamerManager.update(gamer1);
		gamerManager.delete(gamer1);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign(1, "Buyuk Yaz Indirimi", 5);
		GameManager gameManager = new GameManager(new ValidationManager());
		Game game = new Game(1, "FIFA 21", 100);
		
		System.out.println();
		campaignManager.add(campaign);
		campaign.setDiscountRate(67);
		campaignManager.update(campaign);
		campaignManager.delete(campaign);
		
		System.out.println();
		gameManager.add(game);
		game.setPrice(419.99);
		gameManager.update(game);
		gameManager.discountGame(game, campaign);
		gameManager.gameSale(game, gamer, campaign);
		
		System.out.println();
		gameManager.add(game);
		game.setPrice(419.99);
		gameManager.update(game);
		gameManager.discountGame(game, campaign);
		gameManager.gameSale(game, gamer1, campaign);
		
	}
}
