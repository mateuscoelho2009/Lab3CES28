package LetterBuilder;

public class CommercialLetter extends LetterBuilder {
	Person destinatary_;
	Address addressDestiny_;

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
		return date_ + "\n\n" + sender_ + "\n" + addressSender_ + "\n" + destinatary_ + addressDestiny_ + "\n";
	}

	@Override
	protected String body() {
		return "Caro(a) " + destinatary_ + "\n";
	}

	@Override
	protected String conclusion() {
		return  "\nSinceramente,\n";
	}

}
