package cardRank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");

        for (CardRanks cards : CardRanks.values()) {

            System.out.printf("Ordinal value: %d; Name value: %s\n",
                    cards.ordinal(), cards.name());
        }
    }
}
