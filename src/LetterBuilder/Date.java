package LetterBuilder;

public abstract class Date {
	String day_, month_, year_;
	
	public Date (String day, String month, String year) {
		day_ = day;
		month_ = month;
		year_ = year;
	}
	
	public abstract String toString ();
}
