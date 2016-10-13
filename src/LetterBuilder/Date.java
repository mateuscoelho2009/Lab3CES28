package LetterBuilder;

public class Date {
	String day_, month_, year_;
	boolean englishMode;
	
	Date (String day, String month, String year) {
		day_ = day;
		month_ = month;
		year_ = year;
		
		englishMode = true;
	}
	
	Date (String day, String month, String year, boolean isEnglish) {
		day_ = day;
		month_ = month;
		year_ = year;
		
		englishMode = isEnglish;
	}
	
	@Override
	public String toString () {
		if (englishMode)
			return month_ + "/" + day_ + "/" + year_;
		
		return day_ + " de " + month_ + " de " + year_;
	}
}
