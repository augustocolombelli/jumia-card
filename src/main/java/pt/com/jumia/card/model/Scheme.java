package pt.com.jumia.card.model;

public enum Scheme {
	VISA("Visa"), MASTERCARD("Mastercard"), AMEX("Amex");

	private String schemeStr;

	Scheme(String schemeStr) {
		this.schemeStr = schemeStr;
	}

	public String getSchemeStr() {
		return schemeStr;
	}

}
