/*
 *
 */
package deliverable1;

public enum CardValue {
    DEUCE(2), THREE(3), FOUR(4),
    FIVE(5), SIX(6), SEVEN(7), EIGHT(8),
    NINE(9), TEN(10), JACK(11), QUEEN(12),
    KING(13), ACE(15);

    private final int value;

    CardValue(int value) {
        this.value = value;
    }

    //returns value
    public int getValue()
    {
        return this.value;
    }
}
