package Generics_5.Challenge2;

public class Running {
    private String colour;
    private Integer number;

    public Running(String colour, Integer number) {
        this.colour = colour;
        this.number = number;
    }

    public String getColour() {
        return colour;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Running{" +
                "colour='" + colour + '\'' +
                ", number=" + number +
                '}';
    }
}
