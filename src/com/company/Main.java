package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main
    {

        public static void main(String[] args)
            {
	            String [] namesOPlenty = {"Veler", "Carty", "Arranis", "The Seeker", "Illuminatus", "Human", "A117", "Claude Frollo", "Some Insane Idiot", "Angelo", "NO IT'S ANGLEO", "Or Jello", "Hope", "Deadpool", "Isabella", "Jonah", "Char", "Abe", "Some Politician", "Abraham Daniel Pennebacker", "Bennett", "Kvothe", "Ambrose", "Sheldon Cooper", "Kilvin", "Aubrey", "Caleb", "asdf", "jkl;", "Lucas", "Yet another Bennett", "Cinder", "Haliax", "Winston", "Harambe", "Eden", "Adam", "Eve", "Eva", "Shannon", "Sharon", "Valerie", "Jewel", "Calvin", "Ethan", "Hobbes", "Adam Smith", "Hemme", "Newton", "Barik"};
                Scanner strscan = new Scanner(System.in);
	            Arrays.sort(namesOPlenty);
                System.out.println("Welcome to Guess Thou Names\nThe names you can chose are:");
                for (String s:namesOPlenty)
                    System.out.println(s);
                boolean loops = true;
                int lowerBound = 0;
                int upperBound = namesOPlenty.length-1;
                while (loops)
                    {
                        System.out.println("Is the name " + namesOPlenty[(int)((upperBound+lowerBound)/2)] + "?\n Answer Y for yes\n Answer N for no");
                        switch (strscan.nextLine())
                            {
                                case "Y" :
                                    System.out.println("Yay! I quessed the name! Goodbye!");
                                    loops = false;
                                    break;
                                case "N" :
                                    System.out.println("Was your name higher or lower on the list?\nH for higher\nL for lower");
                                    while(loops)
                                        {
                                            switch (strscan.nextLine())
                                                {
                                                    case "H" :
                                                        upperBound = (int)((upperBound+lowerBound)/2);
                                                        loops = false;
                                                        break;
                                                    case "L" :
                                                        lowerBound = (int)((upperBound+lowerBound)/2);
                                                        loops = false;
                                                        break;
                                                    default:
                                                        System.out.println("Enter a valid command.");
                                                        break;
                                                }
                                        }
                                    loops = true;
                                    break;
                                default:
                                    System.out.println("Enter a valid command.");
                                    break;

                            }
                    }
            }
    }
