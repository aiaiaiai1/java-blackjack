package controller;

import domain.*;
import view.InputView;
import view.OutputView;

public class Controller {
    InputView inputView;
    OutputView outputView;

    public Controller(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        Dealer dealer = new Dealer();
        Players players = new Players(inputView.readPlayerNames());
        BlackjackGame game = new BlackjackGame(dealer, players, new CardDeck(new CardGenerator().generate()));
        distributeInitialCard(dealer, players, game);

        selectAdditionalCard(players, game);
        addWhenUnderStandard(dealer, game);

        outputView.printCardsResult(dealer, players);
        outputView.printWinnerResult(game.getDealerResult(),game.getPlayersResult());
    }

    private void distributeInitialCard(Dealer dealer, Players players, BlackjackGame game) {
        game.distributeInitialCard();
        outputView.printInitialCards(dealer, players);
    }

    private void selectAdditionalCard(Players players, BlackjackGame game) {
        for (Player player : players.getPlayers()) {
            String command;
            do {
                command = inputView.readCommand(player.getName().getName());
                if (command.equals("y")) {
                    game.distributePlayer(player);
                }
                outputView.printPlayerCardsInfo(player);
            } while (!player.isOverBlackJack() && command.equals("y"));
        }
    }

    private void addWhenUnderStandard(Dealer dealer, BlackjackGame game) {
        while (!dealer.isOverStandard()) {
            game.distributeDealer();
            outputView.printDistributeDealer(dealer);
        }
    }

}
