package pt.com.jumia.card.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.com.jumia.card.model.Card;

public interface CardRepository extends JpaRepository<Card, Long> {
	Optional<Card> findById(Long id);

}
