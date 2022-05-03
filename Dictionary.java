package com.CSCI185;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        String fileName = "allwords.txt";

        try
        {
            Scanner inputStream = new Scanner(new File(fileName));
            while(inputStream.hasNextLine())
            {
                String line = inputStream.nextLine();
                String[] token = line.split("\t");
                String word = token[0];
                String pos = token[1];
                String defn = token[2];
                if(word.length()>5)
                {
                    System.out.printf("%s - %s\n %s\n", word, pos, defn);
                    System.out.println("-------------------------");
                }
//                System.out.printf("%s - %s\n %s\n", word, pos, defn);
//                System.out.println("-------------------------");
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
