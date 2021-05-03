package Managers;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Interfaces.IGameService;
import Interfaces.IValidationService;

public class GameManager implements IGameService {

	private IValidationService _validationService;
	public GameManager(IValidationService validationService) {
		_validationService = validationService;
	}
	@Override
	public void add(Game game) {
		System.out.println("Oyun Sisteme Eklendi: " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Bilgileri Sistemden Silindi: " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " oyununun yeni fiyati: " + game.getPrice());
		
	}

	@Override
	public void gameSale(Game game, Gamer gamer, Campaign campaign) {
		
		if(_validationService.checkPerson(gamer)) {
			
			System.out.println("Oyun: " + game.getName() + " " 
					+ gamer.getFirstName() + " adli oyuncu tarafindan " + game.getPrice() + " liraya alindi");
		}
		else 
			System.out.println("Sistemde Boyle Bir Kullanici Olmadigindan Satis Yapilamamistir.");
		
		
	}

	@Override
	public void discountGame(Game game, Campaign campaign) {
		game.setPrice(game.getPrice() - (game.getPrice() * (campaign.getDiscountRate() / 100)));
		System.out.println("Oyun: " + game.getName() + " " 
				+ campaign.getName() + " adli kampanya ile " + game.getPrice() + " liraya dustu.");
		
	}

}
