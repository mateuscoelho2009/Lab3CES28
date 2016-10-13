package LetterBuilder;

public class PresidentLetter extends LetterBuilder {

	Person destinatary_;
	Address addressDestiny_;
	String assunto_;
	
	PresidentLetter (Person sender, Person destinatary,
					 Address addressSender,  Address addressDestiny, 
					 String assunto, Date date) {
		sender_ = sender;
		destinatary_ = destinatary;
		addressSender_ = addressSender;
		addressDestiny_ = addressDestiny;
		date_ = date;
		assunto_ = assunto;
	}

	@Override
	protected String header() {
		return date_ + "\n\n" + sender_ + "\n" + addressSender_ + "\n" + destinatary_ + addressDestiny_ +
				"\n Ao Excelentíssimo Senhor Presidente da República\n\n" + destinatary_ + "\n\nAssunto: "
				+ assunto_ + "\n\n";
	}

	@Override
	protected String body() {
		return "Senhor Presidente,\n\n";
	}

	@Override
	protected String conclusion() {
		return "\nAtenciosamente,\n";
	}

}
