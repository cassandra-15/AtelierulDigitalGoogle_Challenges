package Exceptions_and_IO_4.Challenge3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Anagrams {
    static String baseWord="listen";
    public static void main(String[] args) throws FileNotFoundException {
        List<String> wordsList=new ArrayList<>();
        File file=new File("src\\Exceptions_and_IO_4\\Challenge3\\words.txt");
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine())
        {
            String str= String.valueOf(sc.nextLine());
            wordsList.add(str);
        }
        for(String word:wordsList)
            if(isAnagram(word))
                System.out.println(word);

    }

    public static boolean isAnagram(String word)
    {
        if(baseWord.length()!=word.length())
            return false;
        char[] wordChars=word.toCharArray();
        char[] baseWordChars=baseWord.toCharArray();

        Arrays.sort(wordChars);
        Arrays.sort(baseWordChars);

        return Arrays.equals(wordChars,baseWordChars);
    }
}
