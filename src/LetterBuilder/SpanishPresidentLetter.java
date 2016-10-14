package LetterBuilder;

public class SpanishPresidentLetter extends PresidentLetter {

	public SpanishPresidentLetter(Person sender, Person destinatary,
			Address addressSender, Address addressDestiny, String assunto,
			Date date) {
		super(sender, destinatary, addressSender, addressDestiny, assunto, date);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String SaudacaoAoPresidenteNaLinguagem() {
		// TODO Auto-generated method stub
		return "A su Excelencia el Presidente";
	}

	@Override
	protected String AssuntoNaLinguagem() {
		// TODO Auto-generated method stub
		return "Sujeto";
	}

	@Override
	protected String SenhorPresidenteNaLinguagem() {
		// TODO Auto-generated method stub
		return "Estimado Señor Presidente";
	}

	@Override
	protected String AtenciosamenteNaLinguagem() {
		// TODO Auto-generated method stub
		return "Graciosamente";
	}

}
