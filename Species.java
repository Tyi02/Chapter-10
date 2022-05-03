package com.CSCI185;


import java.io.Serializable;
import java.util.Scanner;
/**
Serialized class for data on endangered species.
*/
public class Species implements Serializable
{
    private String name;
    private int population;
    private double growthRate;
    public Species ()
    {
        name = null;
        population = 0;
        growthRate = 0;
    }
    public Species (String initialName, int initialPopulation,
            double initialGrowthRate)
    {
        name = initialName;
        if (initialPopulation >= 0)
            population = initialPopulation;
        else
        {
            System.out.println ("ERROR: Negative population.");
            System.exit (0);
        }
        growthRate = initialGrowthRate;
    }
    public void readInput ()
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.println ("What is the species' name?");
        name = keyboard.nextLine ();
        System.out.println ("What is the population of the species?");
        population = keyboard.nextInt ();
        System.out.println ("Enter growth rate (% increase per year):");
        growthRate = keyboard.nextDouble ();
    }
    public void writeOutput ()
    {
        System.out.println ("Name = " + name);
        System.out.println ("Population = " + population);
        System.out.println ("Growth rate = " + growthRate + "%");
    }
    public int predictPopulation (int years)
    {
        int result = 0;
        double populationAmount = population;
        int count = years;
        while ((count > 0) && (populationAmount > 0))
        {
            populationAmount = (populationAmount +
                    (growthRate / 100) * populationAmount);
            count --;
        }
        if (populationAmount > 0)
            result = (int) populationAmount;
        return result;
    }
    public void setSpecies (String newName, int newPopulation,
                            double newGrowthRate)
    {
        name = newName;
        if (newPopulation >= 0)
            population = newPopulation;
        else
        {
            System.out.println (
                    "ERROR: using a negative population.");
            System.exit (0);
        }
        growthRate = newGrowthRate;
    }
    public String getName ()
    {
        return name;
    }
    public int getPopulation ()
    {
        return population;
    }
    public double getGrowthRate ()
    {
        return growthRate;
    }
    public String toString ()
    {
        return ("Name = " + name + "\n" +
                "Population = " + population + "\n" +
                "Growth rate = " + growthRate + "%");
    }
    public boolean equals (Species otherObject)
    {
        return (this.name.equalsIgnoreCase (otherObject.name)) &&
                (this.population == otherObject.population) &&
                (this.growthRate == otherObject.growthRate);
    }
    //Other methods are the same as those in Listing 5.17 of Chapter 5,
    //but they are not needed for the discussion in this chapter.
}
