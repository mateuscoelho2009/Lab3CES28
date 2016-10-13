package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import LetterBuilder.Address;
import LetterBuilder.Date;
import LetterBuilder.LetterBuilder;
import LetterBuilder.LetterDirector;
import LetterBuilder.Person;

public class EX1Testes {
	Person sender;
	String destinatary;
	Address addressSender, addressDestiny;
	String assunto;
	Date date;
	
	@Test
	public void WhenPresidentLetterExpectRightLetter() {
		LetterDirector lb = LetterDirector.presidentLetterDirector(sender,
																  destinatary,
																  addressSender,
																  addressDestiny,
																  assunto,
																  date);
	}
	
	@Test
	public void WhenCommercialLetterExpectRightLetter() {
		fail("Not yet implemented");
	}
	
	@Test
	public void WhenCollegeDiscountLetterExpectRightLetter() {
		fail("Not yet implemented");
	}

}
