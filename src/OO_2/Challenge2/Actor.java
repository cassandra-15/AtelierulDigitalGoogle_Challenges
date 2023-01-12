package OO_2.Challenge2;

import java.util.Arrays;

public class Actor {
    private String nume;
    private Integer varsta;
    private Premiu[] premii;

    public Actor(String nume, Integer varsta, Premiu[] premii) {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }

    public String getNume() {
        return nume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public Premiu[] getPremii() {
        return premii;
    }


    @Override
    public String toString() {
        return "Actor{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", premii=" + Arrays.toString(premii) +
                '}';
    }
}
