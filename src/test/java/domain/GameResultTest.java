package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GameResultTest {
    Dealer dealer = new Dealer();
    Players players = new Players("pobi,jason");
    CardDeck cardDeck = new CardDeck(new CardGenerator().generate());

//    @Test
//    @DisplayName("플레이어와 딜러의 승패 계산")
//    void calculateWinOrLoseTest() {
//        GameResult gameResult = new GameResult(new Dealer(), new Players(","));
//
//        Assertions.assertThat(gameResult.isPlayerWin(21, 10)).isEqualTo(ResultType.LOSE);
//        Assertions.assertThat(gameResult.isPlayerWin(10, 21)).isEqualTo(ResultType.WIN);
//        Assertions.assertThat(gameResult.isPlayerWin(25, 22)).isEqualTo(ResultType.LOSE);
//        Assertions.assertThat(gameResult.isPlayerWin(21, 21)).isEqualTo(ResultType.DRAW);
//    }

    @Test
    @DisplayName("플레이어의 최종 승패 결과를 가져온다.")
    void calculatePlayerWinOrLoseTest() {
        BlackjackGame blackjackGame = new BlackjackGame(dealer, players, cardDeck);

        blackjackGame.distributeInitialCard();

        Map<String, ResultType> playerResult = new LinkedHashMap<>();
        playerResult.put("pobi", ResultType.LOSE);
        playerResult.put("jason", ResultType.LOSE);

        Assertions.assertThat(blackjackGame.getGameResult().getPlayerResult()).isEqualTo(playerResult);
    }

    @Test
    @DisplayName("딜러의 최종 승패 결과를 가져온다.")
    void calculateDealerWinOrLoseTest() {
        BlackjackGame blackjackGame = new BlackjackGame(dealer, players, cardDeck);

        blackjackGame.distributeInitialCard();

        Map<String, List<ResultType>> dealerResult = new LinkedHashMap<>();

        dealerResult.put(dealer.getName(), List.of(ResultType.WIN, ResultType.WIN));

        Assertions.assertThat(blackjackGame.getGameResult().getDealerResult()).isEqualTo(dealerResult);
    }
}
