package Design_Patterns_3.Challenge3;

public class RealEstateAgentProxy implements RealEstateAgent {
    private Apartament ap;

    @Override
    public void represent(Apartament apartament) {
        this.ap=apartament;
    }

    @Override
    public Apartament rent(Student student) {
        String nume= String.valueOf(student.name.charAt(0));
        if(!nume.equals("P"))
            return ap;
        else
            return null;
    }
}
