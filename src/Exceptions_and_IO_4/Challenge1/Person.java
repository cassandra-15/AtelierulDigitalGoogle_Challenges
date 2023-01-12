package Exceptions_and_IO_4.Challenge1;

public class Person {
    private String nume;
    private Long phoneNumber;

    public Person(String nume, Long phoneNumber) {
        this.nume = nume;
        this.phoneNumber = phoneNumber;
    }

    public Person() {

    }

    public String getNume() {
        return nume;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nume='" + nume + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

}
