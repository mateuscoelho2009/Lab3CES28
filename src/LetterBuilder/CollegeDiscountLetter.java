package LetterBuilder;

public abstract class CollegeDiscountLetter extends LetterBuilder {
	String destinatary_, departament_;
	Address addressDestiny_;
	String numMatricula_;

	CollegeDiscountLetter (Person sender, String numMatricula,
					String destinatary, String departament,
					Address addressSender, Address addressDestiny,
					Date date) {
		sender_ = sender;
		destinatary_ = destinatary;
		departament_ = departament;
		addressSender_ = addressSender;
		addressDestiny_ = addressDestiny;
		date_ = date;
		numMatricula_ = numMatricula;
	}

	@Override
	protected String header() {
		return date_ + "\n\n" + sender_ + "\n" + addressSender_ + "\n" + destinatary_ + addressDestiny_ + "\n";
	}

	@Override
	protected String body() {
		return bodyFunction();
	}
        
        protected String bodyFunction() {
		String s = "";
		
		s += EuLanguages() + ", " + sender_ + ", ";
		
		String aux = sender_.getNacionalidade();
		if (!aux.equals(""))
			s += aux + ", ";
		else
			s += "(" + nacionalidadeLanguages() + "), ";
		
		aux = sender_.getEstadoCivil();
		if (!aux.equals(""))
			s += aux + ", ";
		else
			s += "(" + estadoCivilLanguages()+ "), ";
		
		aux = sender_.getProfissao();
		if (!aux.equals(""))
			s += aux + ", ";
		else
			s += "(" +profissaoLanguages()+ "), ";
		
		s += cpfLanguages();
		
		aux = sender_.getCPF();
		if (!aux.equals(""))
			s += aux + ", ";
		else
			s += "(" + informarLanguages() + "), ";
		
		s += nMatriculaLanguages();
		
		aux = numMatricula_;
		if (!aux.equals(""))
			s += aux + ", ";
		else
			s += "(" + informarLanguages() + "), ";
		
		s += razaoLanguages() + "\n\n";
		
		return s;
	}

	@Override
	protected String conclusion() {
		return  "\n" +termosLanguages() + ",\n\n" +pedeLanguages() + ".";
	}

	@Override
	protected String signature() {
		return  addressSender_ + ", " + date_ + "." +
				"\n\n\t\t __________________\n\t\t "+ sender_ + "\n\t\t " + sender_.getPhone() + "\n\t\t email:" + sender_.getEmail();
	}
        
        abstract protected String EuLanguages();
        abstract protected String nacionalidadeLanguages();
        abstract protected String estadoCivilLanguages();
        abstract protected String profissaoLanguages();
        abstract protected String cpfLanguages();
        abstract protected String informarLanguages();
        abstract protected String nMatriculaLanguages();
        abstract protected String razaoLanguages();
        abstract protected String termosLanguages();
        abstract protected String pedeLanguages();
}
