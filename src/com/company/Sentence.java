package com.company;


import java.util.*;


public class Sentence {
    Map<Character, Integer> words;


    public Sentence() {
       words = new HashMap<>();
    }
    private List<String> splitSentence(String sentence){
        ArrayList<String> list = new ArrayList<>();
        String[] tokens = sentence.split(" ");
        for(String token : tokens){
            list.add(token);
        }
        return list;
    }
    public void countWords(String sentence){

        List<String> words = splitSentence(sentence);


            for(String values : words){
                String word = values.toLowerCase();
                char[] mychar = word.toCharArray();
                for(int j=0; j<= mychar.length-1; j++){
                    if(this.words.containsKey(mychar[j])){
                        int count = this.words.get(mychar[j]);
                        this.words.put(mychar[j], count +1);
                    }else
                        this.words.put(mychar[j], 1);
                }
            }

    }
    public void printWords(){
        Set<Character> keys = words.keySet();
        TreeSet<Character> sortedKeys = new TreeSet<>(keys);
        System.out.printf("%nMap contains : %nKey\t\tValue%n");
        for(char value: sortedKeys){
            System.out.println(value + "       "+ words.get(value));
        }
    }
}
