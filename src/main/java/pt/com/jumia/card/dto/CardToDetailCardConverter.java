package pt.com.jumia.card.dto;

import pt.com.jumia.card.model.Card;

public class CardToDetailCardConverter {

	public DetailCardDto convert(Card card) {
		DetailCardDto dto = new DetailCardDto();
		if (card.getBank() != null) {
			dto.setBank(card.getBank().getName());
		}
		dto.setScheme(card.getScheme().getSchemeStr());
		dto.setType(card.getType().getCardTypeStr());
		dto.setValid(card.getValid());
		return dto;
	}

}
