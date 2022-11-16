package cardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CardRank cardRank = CardRank.valueOf(sc.nextLine());
        CardSuite cardSuite = CardSuite.valueOf(sc.nextLine());


        System.out.printf("Card name: %s of %s; Card power: %d", cardRank, cardSuite,
                cardRank.getPower() + cardSuite.getPower());
    }
}
