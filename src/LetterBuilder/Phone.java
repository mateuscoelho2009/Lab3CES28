package LetterBuilder;

public abstract class Phone {
	protected String number_;
	protected String DDD_;
	
	public Phone(String DDD,String number){
		number_=number;
		DDD_=DDD;
	}
	
	public abstract String toString ();

}
