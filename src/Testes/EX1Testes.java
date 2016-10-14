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
import LetterBuilder.LetterDirector;
import LetterBuilder.Person;

public class EX1Testes {
	Person sender;
	String destinatary;
	Address addressSender, addressDestiny;
	String assunto, numMatricula, departament;
	Date date;
	
	LetterDirector ld;
	
	@Before
	public void setup () {
		String name = "Mateus Menezes",
			   phone = "(XX) 9XXXX-XXXX",
			   email = "XXXXXXXX@gmail.com",
			   nacionalidade = "Português",
			   estadoCivil = "Fazendo Faculdade",
			   profissao = "Estudante codador",
			   cpf = "XXX.xxx.XXX-XX";
		
		sender = new Person(name, phone, email, nacionalidade, estadoCivil, profissao, cpf);
		
		destinatary = "Arnold Schwarzeneger";
		addressSender = new Address("rua Dos bobos");
		addressDestiny = new Address("Alguma avenida");
		assunto = "Quero dinheiro";
		numMatricula = "XXXX.xxxxx";
		departament = "Departamento de Voo em Terra";
		date = new Date("21", "Agosto", "1000", false);
	}
	
	@Test
	public void WhenPresidentLetterExpectRightLetter() {		
		ld = LetterDirector.portuguesePresidentLetterDirector(sender,
													destinatary,
													addressSender,
													addressDestiny,
													assunto,
													date);
		
		System.out.println(ld.Construct());
	}
	
	@Test
	public void WhenCommercialLetterExpectRightLetter() {
		ld = LetterDirector.portugueseCommercialLetterDirector(sender, 
													 destinatary,
													 addressSender,
													 addressDestiny,
													 date);
		
		System.out.println(ld.Construct());
	}
	
	@Test
	public void WhenCollegeDiscountLetterExpectRightLetter() {
		ld = LetterDirector.collegeDiscountLetterDirector(sender,
														  numMatricula,
														  destinatary,
														  departament,
														  addressSender, 
														  addressDestiny,
														  assunto,
														  date);
		
		System.out.println(ld.Construct());
	}

}
