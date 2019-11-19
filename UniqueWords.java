package edu.cscc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
 /**
 * Utility to process a document to into sorted set of unique words
 * @author Kelly Waddell
 */
public class UniqueWords {
    /**
     * Read file one line at a time
     * Break input String into words
     * Store unique words sorted into alphabetic order
     * @param myfile input file
     * @return sorted set of unique words
     */
    public static <array> Set<String> processDocument(File myfile) {
        //Adding in a TreeSet collection
        TreeSet<String> Words = new TreeSet<>();
        //Initializing a Scanner and a Array
        Scanner input = null;
        String[] array;
        //Try catch to add Scanner to Myfile
        try {
            input = new Scanner(myfile);
        } catch (FileNotFoundException e) {
            /**
             * @Exception FileNotFoundException
             */
            System.out.println("File was not found");
        }
        //While loop to read each line of code
        while (input.hasNext()){
            String line=input.nextLine();
            array = tokenize(line);
            for(String words : array ){
                Words.add(words);
            }
        }
            return Words;
    }

    /**
     * Remove all punctuation and numbers from String
     * Tokenize - break into individual words
     * Convert all words to lower case
     * @param str initial non-null String
     * @return array of words from initial String
     */
    public static String[] tokenize(String str) {
        str = str.replaceAll("[^a-zA-Z \n]"," ");
        String[] tok = str.split(" ");
        for (int i=0; i<tok.length; ++i) {
            tok[i] = tok[i].toLowerCase();
        }
        return tok;
    }
}
