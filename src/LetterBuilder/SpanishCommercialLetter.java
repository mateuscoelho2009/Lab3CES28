package LetterBuilder;

public class SpanishCommercialLetter extends CommercialLetter {

	public SpanishCommercialLetter(Person sender, Person destinatary,
			Address addressSender, Address addressDestiny, Date date) {
		super(sender, destinatary, addressSender, addressDestiny, date);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String CaroNaLinguagem() {
		// TODO Auto-generated method stub
		return "Caro";
	}

	@Override
	protected String SinceramenteNaLinguagem() {
		// TODO Auto-generated method stub
		return "Sinceramente";
	}

}
