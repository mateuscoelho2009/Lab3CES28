package LetterBuilder;

public class PhoneType2 extends Phone {
	public PhoneType2(String DDD,String number){
		super(DDD,number);
	}
	
	@Override
	public String toString(){
		return "DDD: " + DDD_ + " Tel: " + number_.substring(0, 5) + "." + number_.substring(5, 9);
		
	}
}
