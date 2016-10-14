package LetterBuilder;

abstract public class PresidentLetter extends LetterBuilder {

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
				"\n " + SaudacaoAoPresidenteNaLinguagem() + "\n\n" + destinatary_ + "\n\n" + AssuntoNaLinguagem () + ": "
				+ assunto_ + "\n\n";
	}
	
	protected abstract String SaudacaoAoPresidenteNaLinguagem ();
	protected abstract String AssuntoNaLinguagem ();
	
	/*protected String headerFunction () {
		return date_ + "\n\n" + sender_ + "\n" + addressSender_ + "\n" + destinatary_ + addressDestiny_ +
				"\n Ao Excelentíssimo Senhor Presidente da República\n\n" + destinatary_ + "\n\nAssunto: "
				+ assunto_ + "\n\n";
	}*/

	@Override
	protected String body() {
		return SenhorPresidenteNaLinguagem() + ",\n\n";
	}
	
	protected abstract String SenhorPresidenteNaLinguagem ();

	@Override
	protected String conclusion() {
		return "\n" + AtenciosamenteNaLinguagem () + ",\n";
	}
	
	protected abstract String AtenciosamenteNaLinguagem ();
	
	protected String conclusionFunction () {
		return "\nAtenciosamente,\n";
	}

}
