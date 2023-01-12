package Exceptions_and_IO_4.Challenge5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WordAppearance {
    private static List<String> wordList=new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("src\\Exceptions_and_IO_4\\Challenge5\\file.txt");
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine())
        {
            String s= sc.next();
            List<String> strings= Arrays.asList(s.split("[\\?\\ ]"));
            for(String str:strings)
                wordList.add(str);
        }
        String word=wordList.get(0);
        String word1=wordList.get(1);
        String word2=wordList.get(2);

        System.out.println(word+"-"+countWord(word));
        System.out.println(word1+"-"+countWord(word1));
        System.out.println(word2+"-"+countWord(word2));
    }
    public static int countWord(String word)
    {
        Integer count=0;
        for(String words:wordList)
        {
            if(words.equals(word))
                count+=1;
        }
        return count;
    }
}

