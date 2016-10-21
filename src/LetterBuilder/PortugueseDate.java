package LetterBuilder;

public class PortugueseDate extends Date {

	public PortugueseDate (String day, String month, String year) {
		super(day, month, year);
	}
		
	@Override
	public String toString() {
		return day_ + "/" + month_ + "/" + year_;
	}

}
