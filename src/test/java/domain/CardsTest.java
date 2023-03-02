package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CardsTest {

    @Test
    @DisplayName("Cards에 Card를 추가한다.")
    void add() {
        Cards cards = new Cards();

        cards.add(new Card(CardNumber.ACE,CardPattern.SPADE));

        Assertions.assertThat(cards.getCard(0))
                .usingRecursiveComparison()
                .isEqualTo(new Card(CardNumber.ACE,CardPattern.SPADE));
    }

    @Test
    @DisplayName("카드목록의 합을 계산한다.")
    void sumTest() {
        Card card1 = new Card(CardNumber.ACE,CardPattern.SPADE);
        Card card2 = new Card(CardNumber.ACE,CardPattern.DIAMOND);
        Cards cards = new Cards();
        cards.add(card1);
        cards.add(card2);

        Assertions.assertThat(cards.getSum()).isEqualTo(22);
    }

    @Test
    @DisplayName("ACE의 존재여부를 확인 할 수 있다.")
    void isExistAceTest() {
        Card card1 = new Card(CardNumber.ACE,CardPattern.DIAMOND);
        Cards cards = new Cards();
        cards.add(card1);

        Assertions.assertThat(cards.isExistAce()).isTrue();
    }
    
}