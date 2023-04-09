package lesson3.casino;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();

       //проверили что генерится рандомная карта от дилера
       // Card c = dealer.getCard(); //получили карту от диллера
       // System.out.println(c);

        Scanner scanner = new Scanner(System.in);
        List<Card> hand = new ArrayList<>();
        do {
            Card c = dealer.getCard();
            hand.add(c);
            System.out.println("Карта: " + c);
            int score = 0;
            for (Card card : hand) {
                score += card.getValue();
            }
            System.out.println("Ваш счет: " + score);
            System.out.println("Нажмите N для прекращения игры");
        } while (!scanner.next().equals("N"));
    }
}
