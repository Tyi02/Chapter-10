package com.CSCI185;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class TextFileInputDemo
{
    public static void main (String [] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type a file name to access.");
        String fileName = keyboard.next();

        Scanner inputStream = null;
        System.out.println ("The file " + fileName +
                "\ncontains the following lines:\n");
        try
        {
            inputStream = new Scanner (new File (fileName));
        }
        catch (FileNotFoundException e)
        {
            System.out.println ("Error opening the file " +
                    fileName);
            System.exit (0);
        }
        while (inputStream.hasNextLine ())
        {
            String line = inputStream.nextLine ();
            System.out.println (line);

        }
        inputStream.close ();
    }
}