package fr.p10.miage.rps.model;

/**
 * Projet pooaTDD
 * Created by masalsed on 27/09/2016.
 */
public enum Result {
    WIN("WIN"), TIE("TIE"), LOST("LOST")
    ;
    private final String value;

    private Result(final String value) {
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
