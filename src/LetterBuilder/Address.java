package LetterBuilder;

public class Address {
	String address_;
	
	public Address (String address) {
		address_ = address;
	}
	
	@Override
	public String toString () {
		return address_;
	}
}
