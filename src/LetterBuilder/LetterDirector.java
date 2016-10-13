package LetterBuilder;

public class LetterDirector {
	LetterBuilder letterBuilder_;
	
	private LetterDirector(LetterBuilder lb) {
		letterBuilder_ = lb;
	}
	
	static public LetterDirector commercialLetterDirector (Person sender, String destinatary,
														   Address addressSender, Address addressDestiny,
														   Date date) {
		CommercialLetter cl = new CommercialLetter(sender, new Person(destinatary), addressSender, addressDestiny, date);
		
		return new LetterDirector(cl);
	}
	
	static public LetterDirector presidentLetterDirector  (Person sender, String destinatary,
														   Address addressSender,  Address addressDestiny, 
														   String assunto,
														   Date date) {
		PresidentLetter pl = new PresidentLetter(sender, new Person (destinatary), addressSender, addressDestiny, assunto, date);
	
		return new LetterDirector(pl);
	}
	
	static public LetterDirector collegeDiscountLetterDirector  (Person sender, String numMatricula, String destinatary, String departament,
														   		Address addressSender,  Address addressDestiny, 
														   		String assunto,
														   		Date date) {
		CollegeDiscountLetter cdl = new CollegeDiscountLetter(sender, numMatricula, destinatary, departament, addressSender, addressDestiny, date);
		
		return new LetterDirector(cdl);
	}
	
	public String Construct () {
		return letterBuilder_.model();
	}
}
