package com.CSCI185;

import javax.naming.Name;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Bands {
    /**
     *Write a Program that asks for a users name, age, and favorite band. It then writes it to a file.
     *
     */

    public static void main(String[] args) {
        String fileName = "bands.txt"; //The name could be read from
        //the keyboard.
        PrintWriter outputStream = null;
        try
        {
            outputStream = new PrintWriter (new FileOutputStream(fileName, true));
        }
        catch (FileNotFoundException e)
        {
            System.out.println ("Error opening the file " +
                    fileName);
            System.exit (0);
        }
        Scanner keyboard = new Scanner (System.in);
        System.out.println ("What is your name:");
        String name = keyboard.nextLine();
        System.out.println("What is your age: ");
        int age = keyboard.nextInt();

        keyboard.nextLine();
        System.out.println("What is your favorite band");
        String favband = keyboard.nextLine();

        outputStream.println("Name: "+name);
        outputStream.println("Age: "+age);
        outputStream.println("Favorite band: "+favband);
        outputStream.println("--------------------");
        outputStream.close ();
        System.out.println ("Those lines were written to " +
                fileName);
    }
}
