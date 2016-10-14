package LetterBuilder;

public class LetterDirector {
	LetterBuilder letterBuilder_;
	
	private LetterDirector(LetterBuilder lb) {
		letterBuilder_ = lb;
	}
	
	static public LetterDirector portugueseCommercialLetterDirector (Person sender, String destinatary,
														   Address addressSender, Address addressDestiny,
														   Date date) {
		CommercialLetter cl = new PortugueseCommercialLetter(sender, new Person(destinatary), addressSender, addressDestiny, date);
		
		return new LetterDirector(cl);
	}
	
	static public LetterDirector englishCommercialLetterDirector (Person sender, String destinatary,
																		Address addressSender, Address addressDestiny,
			   															Date date) {
		CommercialLetter cl = new EnglishCommercialLetter(sender, new Person(destinatary), addressSender, addressDestiny, date);
		
		return new LetterDirector(cl);
	}
	
	static public LetterDirector spanishCommercialLetterDirector (Person sender, String destinatary,
																	Address addressSender, Address addressDestiny,
																	Date date) {
		CommercialLetter cl = new SpanishCommercialLetter(sender, new Person(destinatary), addressSender, addressDestiny, date);
		
		return new LetterDirector(cl);
	}
	
	static public LetterDirector portuguesePresidentLetterDirector  (Person sender, String destinatary,
														   Address addressSender,  Address addressDestiny, 
														   String assunto,
														   Date date) {
		PresidentLetter pl = new PortuguesePresidentLetter(sender, new Person (destinatary), addressSender, addressDestiny, assunto, date);
	
		return new LetterDirector(pl);
	}
	
	static public LetterDirector englishPresidentLetterDirector  (Person sender, String destinatary,
														   Address addressSender,  Address addressDestiny, 
														   String assunto,
														   Date date) {
		PresidentLetter pl = new EnglishPresidentLetter(sender, new Person (destinatary), addressSender, addressDestiny, assunto, date);
		
		return new LetterDirector(pl);
	}
	
	static public LetterDirector spanishPresidentLetterDirector  (Person sender, String destinatary,
														   Address addressSender,  Address addressDestiny, 
														   String assunto,
														   Date date) {
		PresidentLetter pl = new SpanishPresidentLetter(sender, new Person (destinatary), addressSender, addressDestiny, assunto, date);
		
		return new LetterDirector(pl);
	}
	
	static public LetterDirector portugueseCollegeDiscountLetterDirector  (Person sender, String numMatricula, String destinatary, String departament,
														   		Address addressSender,  Address addressDestiny, 
														   		String assunto,
														   		Date date) {
		CollegeDiscountLetter cdl = new PortugueseCollegeDiscountLetter(sender, numMatricula, destinatary, departament, addressSender, addressDestiny, date);
		
		return new LetterDirector(cdl);
	}
	
	static public LetterDirector englishCollegeDiscountLetterDirector  (Person sender, String numMatricula, String destinatary, String departament,
																   		Address addressSender,  Address addressDestiny, 
																   		String assunto,
																   		Date date) {
		CollegeDiscountLetter cdl = new EnglishCollegeDiscountLetter(sender, numMatricula, destinatary, departament, addressSender, addressDestiny, date);
		
		return new LetterDirector(cdl);
	}
	
	static public LetterDirector spanishCollegeDiscountLetterDirector  (Person sender, String numMatricula, String destinatary, String departament,
																	   		Address addressSender,  Address addressDestiny, 
																	   		String assunto,
																	   		Date date) {
		CollegeDiscountLetter cdl = new SpanishCollegeDiscountLetter(sender, numMatricula, destinatary, departament, addressSender, addressDestiny, date);
		
		return new LetterDirector(cdl);
	}
	
	public String Construct () {
		return letterBuilder_.model();
	}
}
