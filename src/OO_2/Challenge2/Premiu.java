package OO_2.Challenge2;

public class Premiu {
    private String nume;
    private Integer an;

    public Premiu(String nume, Integer an) {
        this.nume = nume;
        this.an = an;
    }

    public String getNume() {
        return nume;
    }

    public Integer getAn() {
        return an;
    }


    @Override
    public String toString() {
        return "Premiu{" +
                "nume='" + nume + '\'' +
                ", an=" + an +
                '}';
    }
}
