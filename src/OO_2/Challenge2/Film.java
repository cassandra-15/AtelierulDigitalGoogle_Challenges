package OO_2.Challenge2;

import java.util.Arrays;

public class Film {
    private Integer anAparitie;
    private String nume;
    private Actor[] actori;

    public Film(Integer anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public Integer getAnAparitie() {
        return anAparitie;
    }

    public String getNume() {
        return nume;
    }

    public Actor[] getActori() {
        return actori;
    }

    @Override
    public String toString() {
        return "Film{" +
                "anAparitie=" + anAparitie +
                ", nume='" + nume + '\'' +
                ", actori=" + Arrays.toString(actori) +
                '}';
    }
}
