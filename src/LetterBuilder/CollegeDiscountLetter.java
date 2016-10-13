package LetterBuilder;

public class CollegeDiscountLetter extends LetterBuilder {
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
		String s = "";
		
		s += "Eu, " + sender_ + ", ";
		
		String aux = sender_.getNacionalidade();
		if (!aux.equals(""))
			s += aux + ", ";
		else
			s += "(nacionalidade), ";
		
		aux = sender_.getEstadoCivil();
		if (!aux.equals(""))
			s += aux + ", ";
		else
			s += "(Estado Civil), ";
		
		aux = sender_.getProfissao();
		if (!aux.equals(""))
			s += aux + ", ";
		else
			s += "(Profissão), ";
		
		s += "inscrito no CPF sob o nº ";
		
		aux = sender_.getCPF();
		if (!aux.equals(""))
			s += aux + ", ";
		else
			s += "(informar), ";
		
		s += "matriculado nesta instituição sobre o nº ";
		
		aux = numMatricula_;
		if (!aux.equals(""))
			s += aux + ", ";
		else
			s += "(informar), ";
		
		s += "vem respeitosamente à presença de Vossa Senhoria, em razão do fato de se encontrar\n\n";
		
		return s;
	}

	@Override
	protected String conclusion() {
		return  "\nTermos em que,\n\nPede deferimento.";
	}

	@Override
	protected String signature() {
		return  addressSender_ + ", " + date_ + "." +
				"\n\n\t\t __________________\n\t\t "+ sender_ + "\n\t\t " + sender_.getPhone() + "\n\t\t email:" + sender_.getEmail();
	}
}
