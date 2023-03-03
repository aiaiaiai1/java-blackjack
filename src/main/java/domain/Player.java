package domain;

import java.util.List;

public class Player {
    private static final int BLACK_JACK = 21;
    private final Name name;
    private final Cards cards;

    public Player(String name) {
        this.name = new Name(name);
        cards = new Cards();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card getCard(int index) {
        return cards.getCard(index);
    }

    public boolean isOverBlackJack() {
        return cards.getSum() >= BLACK_JACK;
    }

    public Name getName() {
        return name;
    }

    public List<String> getCards() {
        return cards.getCards();
    }

    public int getCardsSum() {
        return cards.getSum();
    }
}
