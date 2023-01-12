package Exceptions_and_IO_4.Challenge2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> phrases = new ArrayList<>();
        List<String> words = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        char ch;

        File file = new File("src\\Exceptions_and_IO_4\\Challenge2\\story.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            phrases.add(s);
        }
        for (int i = 0; i < phrases.size(); i++) {
            List<String> sequences = Arrays.asList(phrases.get(i).split("[, \\=\\&\\. \\?\\'\\!]"));
            for (String word : sequences) {
                if (!word.equals(""))
                    words.add(word);
            }
        }

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                ch = word.charAt(i);
                if (Character.isUpperCase(ch))
                    str.append(ch);
            }
        }

        String newString = str.toString().replace("X", " ");
        System.out.println(newString);
    }

}
