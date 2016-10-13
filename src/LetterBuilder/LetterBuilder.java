package LetterBuilder;

abstract class LetterBuilder {
	protected Address addressSender_;
	protected Person sender_;
	protected Date date_;
	
	public String model() {
		return header() + body() + conclusion() + signature();
	}
	
	abstract protected String header();
	abstract protected String body();
	abstract protected String conclusion();
	protected String signature() {
		return "\n\n\t\t __________________\n\t\t "+ sender_ + "\n\t\t " + sender_.getPhone() + "\n\t\t email:" + sender_.getEmail();
	}
}
