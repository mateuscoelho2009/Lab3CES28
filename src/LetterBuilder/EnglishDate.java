package LetterBuilder;

public class EnglishDate extends Date {

	public EnglishDate (String day, String month, String year) {
		super(day, month, year);
	}
		
	@Override
	public String toString() {
		return month_ + "/" + day_ + "/" + year_;
	}

}
