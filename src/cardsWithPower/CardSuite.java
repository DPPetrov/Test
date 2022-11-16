package cardsWithPower;

public enum CardSuite {

    HEARTS(26),
    CLUBS(0),
    SPADES(39),
    DIAMONDS(13);

    private int power;

    CardSuite(int power){
        this.power = power;
    }

    public int getPower(){
        return power;
    }
}
