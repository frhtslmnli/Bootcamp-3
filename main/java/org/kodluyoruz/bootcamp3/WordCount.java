package org.kodluyoruz.bootcamp3;

import java.util.ArrayList;
import java.util.List;

public class WordCount {
    String myString;


    public static int countUniques(String myString) {
        List<String> uniqueWords = new ArrayList<>();

        if(myString.isEmpty()){
            throw new IllegalArgumentException("String can not be empty!");
        }
        else{
            myString = myString.replaceAll(",","");
            myString = myString.replace(".","");
            myString = myString.toLowerCase();
            String[] words = myString.split("\\s+");


            for (String word : words) {
                if (!uniqueWords.contains(word)) {
                    uniqueWords.add(word);
                }
            }
        }
        return uniqueWords.size();
    }
}
