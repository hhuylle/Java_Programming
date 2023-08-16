package day13_customMethods.practice_tasks;

public class FrequencyOfWords {

    public static void main(String[] args) {

        String sentence = "Java java jAvA";
        String word = "Java";

        System.out.println(frequencyOfWords1(sentence,word));
        System.out.println(frequencyOfWords2(sentence,word));

    }

    public static int frequencyOfWords1(String sentence, String word){
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        sentence = sentence.replace(" ","");
        int sentence1 = sentence.length();
        sentence = sentence.replace(word, "");

        return (sentence1 - sentence.length())/word.length();
    }

    public static int frequencyOfWords2(String sentence, String word){
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        String word1 = sentence.replace(word, "a".repeat(word.length()-1));
        int frequency = sentence.length() - word1.length();

        return  frequency;
    }




}
/*
Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)
    The method should return the frequency of the word from the sentence
        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 3
 */
