package Testes;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

import LetterBuilder.Address;
import LetterBuilder.Date;
import LetterBuilder.EnglishDate;
import LetterBuilder.LetterDirector;
import LetterBuilder.Person;
import LetterBuilder.Phone;
import LetterBuilder.PhoneType1;
import LetterBuilder.PhoneType2;
import LetterBuilder.PortugueseDate;

public class EX1Testes {
	Person sender;
	String destinatary;
	Address addressSender, addressDestiny;
	String assunto, numMatricula, departament;
	Date date_;
	Phone phone_;
	String name = "Mateus Menezes",
			   email = "XXXXXXXX@gmail.com",
			   nacionalidade = "Português",
			   estadoCivil = "Fazendo Faculdade",
			   profissao = "Estudante codador",
			   cpf = "XXX.xxx.XXX-XX";
	
	LetterDirector ld;
	
	@Before
	public void setup () {
		phone_ = new PhoneType1("12","852147568");
		date_ = new PortugueseDate("20","03","1995");
		sender = new Person(name, phone_, email, nacionalidade, estadoCivil, profissao, cpf);
		destinatary = "Arnold Schwarzeneger";
		addressSender = new Address("rua Dos bobos");
		addressDestiny = new Address("Alguma avenida");
		assunto = "Quero dinheiro";
		numMatricula = "XXXX.xxxxx";
		departament = "Departamento de Voo em Terra";
	}
	
	@Test
	public void WhenPresidentLetterExpectRightLetter() {
		
		ld = LetterDirector.portuguesePresidentLetterDirector(sender,
													destinatary,
													addressSender,
													addressDestiny,
													assunto,
													date_);
		
		System.out.println(ld.Construct());
	}
	
	@Test
	public void WhenCommercialLetterExpectRightLetter() {
		ld = LetterDirector.portugueseCommercialLetterDirector(sender, 
													 destinatary,
													 addressSender,
													 addressDestiny,
													 date_);
		
		System.out.println(ld.Construct());
	}
	
	@Test
	public void WhenCollegeDiscountLetterExpectRightLetter() {
		ld = LetterDirector.portugueseCollegeDiscountLetterDirector(sender,
														  numMatricula,
														  destinatary,
														  departament,
														  addressSender, 
														  addressDestiny,
														  assunto,
														  date_);
		
		System.out.println(ld.Construct());
	}
	
	@Test
	public void CollegeDiscountLetterExpectRightEnglishLetter() {
		date_ = new EnglishDate("20","03","1995");
		sender = new Person(name, phone_, email, nacionalidade, estadoCivil, profissao, cpf);
		ld = LetterDirector.englishCollegeDiscountLetterDirector(sender,
														  numMatricula,
														  destinatary,
														  departament,
														  addressSender, 
														  addressDestiny,
														  assunto,
														  date_);
		
		System.out.println("\n\n\n"+ld.Construct());
	}
	
	@Test
	public void CollegeDiscountLetterExpectRightEnglishLetterPhoneType2() {
		date_ = new EnglishDate("20","03","1995");
		phone_ = new PhoneType2("12","852147568");
		sender = new Person(name, phone_, email, nacionalidade, estadoCivil, profissao, cpf);
		ld = LetterDirector.englishCollegeDiscountLetterDirector(sender,
														  numMatricula,
														  destinatary,
														  departament,
														  addressSender, 
														  addressDestiny,
														  assunto,
														  date_);
		
		System.out.println("\n\n\n"+ld.Construct());
	}
}
