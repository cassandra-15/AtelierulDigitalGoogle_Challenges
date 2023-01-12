package Design_Patterns_3.Challenge3;

public class Apartament {
    private String location;
    private Integer monthlyRentCost;

    public Apartament(String location, Integer monthlyRentCost) {
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
    }

    @Override
    public String toString() {
        return "Apartament{" +
                "location='" + location + '\'' +
                ", monthlyRentCost=" + monthlyRentCost +
                '}';
    }
}
