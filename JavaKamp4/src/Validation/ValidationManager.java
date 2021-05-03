package Validation;

import Entities.Gamer;
import Interfaces.IValidationService;

public class ValidationManager implements IValidationService{

	@Override
	public boolean checkPerson(Gamer gamer) {
		
		if(gamer.getNationalityId() != null && gamer.getBirthDate() != null && gamer.getFirstName() != null && gamer.getLastName() != null) {
			return true;
		}
		return false;
		
	}
}
