package Design_Patterns_3.Challenge6;

public class Main {
    public static void main(String[] args) {
        Person p1=new Person.Builder("Ioana").build();
        Person p2=new Person.Builder("Luca").setJob("cooker").setUniversity("USV").setDrivingLicense(true).setIsMaried(false).build();
        Person p3=new Person.Builder("Matei").setJob("software developer").setUniversity("UAIC").build();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
