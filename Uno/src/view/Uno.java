package view;

import java.util.Scanner;
import model.Card;
import model.Game;
import model.Hand;
import model.UnoException;

/**
 *
 * @author Michel
 */
public class Uno {

    public static void main(String[] args) throws UnoException {
        try {
            Game game = new Game();
            while (!game.isOver()) {
                Hand[] players = game.getPlayers();
                System.out.println(game.getVisibleCard().toString());//.toString());
                System.out.println(game.getCurrentPlayer() + " est le joueur "
                        + "courant ! ");
                Hand handCurrentPlayer = players[game.getCurrentPlayer()];
                System.out.println("Main de joueur " + game.getCurrentPlayer()
                        + " : ");
                for (int i = 0; i < handCurrentPlayer.size(); i++) {
                    System.out.println(i + 1 + " " + handCurrentPlayer.seeCard(i).toString());//.toString());
                }
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Quelle carte voulez-vous mettre en jeu ?");
                int index = keyboard.nextInt() - 1;
                if (game.getVisibleCard().sameColor(handCurrentPlayer.seeCard(index))
                        || game.getVisibleCard().
                                sameValue(handCurrentPlayer.seeCard(index))) {

                    game.setVisibleCard(handCurrentPlayer.seeCard(index));
                    handCurrentPlayer.removeCard(index);
                    //System.out.println(game.getVisibleCard());
                } else {
                    Card cardToGive = game.getCard();
                    handCurrentPlayer.addCard(cardToGive);
                    for (int i = 0; i < handCurrentPlayer.size(); i++) {
                        System.out.println(i + 1 + " " + handCurrentPlayer.seeCard(i));//.toString());
                    }
                }
                game.nextPlayer();
            }
        } catch (UnoException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
