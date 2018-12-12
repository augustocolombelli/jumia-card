package pt.com.jumia.card.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.com.jumia.card.dto.CardToDetailCardConverter;
import pt.com.jumia.card.dto.DetailCardDto;
import pt.com.jumia.card.exception.ResourceNotFoundException;
import pt.com.jumia.card.model.Card;
import pt.com.jumia.card.repository.CardRepository;

@RestController
@RequestMapping("/api/card-scheme")
public class CardController {

	@Autowired
	private CardRepository repository;

	@GetMapping("/verify/{number}")
	public DetailCardDto getById(@PathVariable("number") Long number) {
		Optional<Card> optionalCard = repository.findById(number);
		if (optionalCard.isPresent()) {
			return new CardToDetailCardConverter().convert(optionalCard.get());
		} else {
			throw new ResourceNotFoundException();
		}
	}
}
