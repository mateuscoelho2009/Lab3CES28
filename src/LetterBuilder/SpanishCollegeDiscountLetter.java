package LetterBuilder;

public class SpanishCollegeDiscountLetter extends CollegeDiscountLetter {

	public SpanishCollegeDiscountLetter(Person sender, String numMatricula,
			String destinatary, String departament, Address addressSender,
			Address addressDestiny, Date date) {
		super(sender, numMatricula, destinatary, departament, addressSender,
				addressDestiny, date);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String EuLanguages() {
		// TODO Auto-generated method stub
		return "Yo";
	}

	@Override
	protected String nacionalidadeLanguages() {
		// TODO Auto-generated method stub
		return "Nacionalidad";
	}

	@Override
	protected String estadoCivilLanguages() {
		// TODO Auto-generated method stub
		return "Estado civil";
	}

	@Override
	protected String profissaoLanguages() {
		// TODO Auto-generated method stub
		return "profesión";
	}

	@Override
	protected String cpfLanguages() {
		// TODO Auto-generated method stub
		return "CPF";
	}

	@Override
	protected String informarLanguages() {
		// TODO Auto-generated method stub
		return "Informar";
	}

	@Override
	protected String nMatriculaLanguages() {
		// TODO Auto-generated method stub
		return "inscrito en esta institución por número";
	}

	@Override
	protected String razaoLanguages() {
		// TODO Auto-generated method stub
		return "viene respetuosamente a la presencia de Su Señoría, debido a la determinación de los hechos";
	}

	@Override
	protected String termosLanguages() {
		// TODO Auto-generated method stub
		return "Los términos que";
	}

	@Override
	protected String pedeLanguages() {
		// TODO Auto-generated method stub
		return "Pide a la aprobación";
	}

}
