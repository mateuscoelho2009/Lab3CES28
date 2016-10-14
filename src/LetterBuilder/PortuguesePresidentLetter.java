package LetterBuilder;

public class PortuguesePresidentLetter extends PresidentLetter {

	PortuguesePresidentLetter (Person sender, Person destinatary,
			 					Address addressSender,  Address addressDestiny, 
			 					String assunto, Date date) {
		super (sender, destinatary, addressSender, addressDestiny, assunto, date);
	}
	
	@Override
	protected String SaudacaoAoPresidenteNaLinguagem() {
		return "Ao Excelentíssimo Senhor Presidente da República";
	}

	@Override
	protected String AssuntoNaLinguagem() {
		// TODO Auto-generated method stub
		return "Assunto";
	}

	@Override
	protected String SenhorPresidenteNaLinguagem() {
		// TODO Auto-generated method stub
		return "Senhor Presidente";
	}

	@Override
	protected String AtenciosamenteNaLinguagem() {
		// TODO Auto-generated method stub
		return "Atenciosamente";
	}

}
