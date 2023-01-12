package Exceptions_and_IO_4.Challenge1;

import OO_2.Challenge2.Film;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public class Phonebook extends Person {
    public List<Person> persons;

    public Phonebook()
    {
        super();
        this.persons = new ArrayList<>();
    }


    public Phonebook(String fileName) throws FileNotFoundException {
        this.persons = new ArrayList<>();
        List<String> list = new ArrayList<>();
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            List<String> lista1 = Arrays.asList(list.get(i).split(" "));
            Person p=new Person(lista1.get(0),parseLong(lista1.get(1)));
            persons.add(p);
        }
    }
}
