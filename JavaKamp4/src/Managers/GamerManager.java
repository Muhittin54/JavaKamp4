package Managers;

import Entities.Gamer;
import Interfaces.IGamerService;
import Interfaces.IValidationService;

public class GamerManager implements IGamerService {

	private IValidationService _validationService;
	

	public GamerManager(IValidationService validationService) {
		super();
		_validationService = validationService;
	}

	@Override
	public void add(Gamer gamer) {
		if(_validationService.checkPerson(gamer))
			System.out.println("Kullanici Sisteme Kayit Edildi: " + gamer.getFirstName());
		else
			System.out.println("Kullanici Bilgileri Dogru Degildir");
		
	}

	@Override
	public void delete(Gamer gamer) {
		if(_validationService.checkPerson(gamer))
			System.out.println("Kullanici Sistemden Silindi: " + gamer.getFirstName());
		else
			System.out.println("Kullanici Sisteme Kayitli Degildir.");
		
		
	}

	@Override
	public void update(Gamer gamer) {
		if(_validationService.checkPerson(gamer))
			System.out.println("Kullanici Kullanici Bilgileri Guncellendi: " + gamer.getFirstName());
		else
			System.out.println("Kullanici Sisteme Kayitli Degildir.");
		
		
	}
}
