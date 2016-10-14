package LetterBuilder;

public class EnglishPresidentLetter extends PresidentLetter {

	public EnglishPresidentLetter(Person sender, Person destinatary,
			Address addressSender, Address addressDestiny, String assunto,
			Date date) {
		super(sender, destinatary, addressSender, addressDestiny, assunto, date);
	}

	@Override
	protected String SaudacaoAoPresidenteNaLinguagem() {
		// TODO Auto-generated method stub
		return "To The President";
	}

	@Override
	protected String AssuntoNaLinguagem() {
		// TODO Auto-generated method stub
		return "Subject";
	}

	@Override
	protected String SenhorPresidenteNaLinguagem() {
		// TODO Auto-generated method stub
		return "Dear Mr. President";
	}

	@Override
	protected String AtenciosamenteNaLinguagem() {
		// TODO Auto-generated method stub
		return "Best regards";
	}

}
