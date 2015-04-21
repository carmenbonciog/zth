package ro.teamnet.zerotohero.gc;

/**
 * Created by my comp on 21.04.2015.
 */
public final class Immutable {
    private final String nume;

    public Immutable(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
}
