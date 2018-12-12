package pt.com.jumia.card.model;

public enum CardType {

	DEBIT("Debit"), CREDIT("Credit");

	private String cardTypeStr;

	CardType(String cardTypeStr) {
		this.cardTypeStr = cardTypeStr;
	}

	public String getCardTypeStr() {
		return cardTypeStr;
	}

}
