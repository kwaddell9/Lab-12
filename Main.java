package edu.cscc;

import java.io.File;
import java.util.Set;
//Kelly Waddell
public class Main {
    //Making fname from the Text file
    private static final String fname = "AtTheMountainsOfMadness_HP_Lovecraft.txt";

    public static void main(String[] args) {
        //Making myfile from fname
        File myfile = new File(fname);
        Set<String> uniques = UniqueWords.processDocument(myfile);
        for (String s : uniques) {
            //Prints out each word
            System.out.println(s);
        }
        //Prints out number of words
        System.out.println("Got "+uniques.size()+" words");
    }
}
