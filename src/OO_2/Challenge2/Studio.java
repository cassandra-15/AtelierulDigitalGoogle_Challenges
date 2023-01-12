package OO_2.Challenge2;

import java.util.Arrays;

public class Studio {
    private String nume;
    private Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public String getNume() {
        return nume;
    }

    public Film[] getFilme() {
        return filme;
    }


    @Override
    public String toString() {
        return "Studio{" +
                "nume='" + nume + '\'' +
                ", filme=" + Arrays.toString(filme) +
                '}';
    }
}
