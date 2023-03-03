package domain;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Dealer {
    private static final String NAME = "딜러";
    private static final int BOUND = 16;
    private final Name name;
    private final Cards cards;

    public Dealer() {
        this.name = new Name(NAME);
        cards = new Cards();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Name getName() {
        return name;
    }

    public Map<String, List<String>> getInfo() {
        Map<String, List<String>> info = new LinkedHashMap<>();
        info.put(getName().getName(), getCards());
        return info;
    }

    public Card getCard(int index) {
        return cards.getCard(index);
    }

    public List<String> getCards() {
        return cards.getCards();
    }

    public boolean isOverStandard() {
        return cards.getSum() > BOUND;
    }

    public int getCardsSum() {
        return cards.getSum();
    }
}
