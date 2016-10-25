package fr.p10.miage.rps.model;

/**
 * Projet pooaTDD
 * Created by masalsed on 27/09/2016.
 */
public enum RPSEnum {
    ROCK("ROCK"), PAPER("PAPER"), SCISSORS("SCISSORS")
    ;
    private final String value;

    private RPSEnum(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return getValue();
    }
}
