package LetterBuilder;

public class EnglishCommercialLetter extends CommercialLetter {

	public EnglishCommercialLetter(Person sender, Person destinatary,
			Address addressSender, Address addressDestiny, Date date) {
		super(sender, destinatary, addressSender, addressDestiny, date);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String CaroNaLinguagem() {
		// TODO Auto-generated method stub
		return "Dear";
	}

	@Override
	protected String SinceramenteNaLinguagem() {
		// TODO Auto-generated method stub
		return "Sincerely";
	}
}
