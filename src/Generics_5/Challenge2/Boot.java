package Generics_5.Challenge2;

public class Boot implements Shoe{
    private String colour;
    private Integer number;

    public Boot(String colour, Integer number) {
        this.colour = colour;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Boot{" +
                "colour='" + colour + '\'' +
                ", number=" + number +
                '}';
    }
}
