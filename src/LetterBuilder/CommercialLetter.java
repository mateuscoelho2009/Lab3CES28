package LetterBuilder;

abstract public class CommercialLetter extends LetterBuilder {
	Person destinatary_;
	Address addressDestiny_;
	Date date_;

	CommercialLetter (Person sender, Person destinatary,
					Address addressSender, Address addressDestiny,
					Date date) {
		sender_ = sender;
		destinatary_ = destinatary;
		addressSender_ = addressSender;
		addressDestiny_ = addressDestiny;
		date_ = date;
	}

	@Override
	protected String header() {
		return date_.toString() + "\n\n" + sender_ + "\n" + addressSender_ + "\n" + destinatary_ + addressDestiny_ + "\n";
	}
	
	
	@Override
	protected String body() {
		return CaroNaLinguagem () + " " + destinatary_ + "\n";
	}
	
	abstract protected String CaroNaLinguagem ();

	@Override
	protected String conclusion() {
		return  "\n" + SinceramenteNaLinguagem () + ",\n";
	}

	abstract protected String SinceramenteNaLinguagem ();
}
