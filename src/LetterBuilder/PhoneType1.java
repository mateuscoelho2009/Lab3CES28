package LetterBuilder;

public class PhoneType1 extends Phone {
		public PhoneType1(String DDD,String number){
			super(DDD,number);
		}
		
		@Override
		public String toString(){
			return "(" + DDD_ + ")" + number_.substring(0,5) + "-" + number_.substring(5,9);
			
		}
}
