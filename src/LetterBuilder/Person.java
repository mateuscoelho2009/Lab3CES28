package LetterBuilder;

public class Person {
	private String name_;
	private String phone_ = "";
	private String email_ = "";
	
	private String nacionalidade_;
	private String estadoCivil_;
	private String profissao_;
	private String cpf_;
	
	public Person (String name, String phone, String email, String nacionalidade,
					String estadoCivil, String profissao, String cpf) {
		name_ = name;
		phone_ = phone;
		email_ = email;
		nacionalidade_ = nacionalidade;
		estadoCivil_ = estadoCivil;
		profissao_ = profissao;
		cpf_ = cpf;
	}
	
	public Person (String name, String phone, String email) {
		name_ = name;
		phone_ = phone;
		email_ = email;
	}
	
	public Person (String name) {
		name_ = name;
	}
	
	@Override
	public String toString () {
		return name_;
	}

	public String getPhone() {
		return phone_;
	}

	public String getEmail() {
		return email_;
	}
	
	public String getNacionalidade () {
		return nacionalidade_;
	}
	
	public String getCPF () {
		return cpf_;
	}
	
	public String getProfissao () {
		return profissao_;
	}
	
	public String getEstadoCivil () {
		return estadoCivil_;
	}
}