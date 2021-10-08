package com.company;

/** A program for counting the occurrence of an alphabet in a given word or sentence
 * @author Felix Ogbonnaya
 * @since 2019-03-02
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Sentence mySentence = new Sentence();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence or word: ");
        String sentence = input.nextLine();

        mySentence.countWords(sentence);
        mySentence.printWords();

    }
}
