package Exceptions_and_IO_4.Challenge1;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Phonebook p1 = new Phonebook("src\\Exceptions_and_IO_4\\Challenge1\\phonenumbers.txt");
        for (Person pers : p1.persons)
            if (pers.getNume().equals("Abbey"))
                System.out.println(pers.getNume() + " " + pers.getPhoneNumber());
    }
}
