package hbcu.stay.ready.algor;

import java.util.Hashtable;

public class Solution {

    public Boolean harmlessRansomNote(String message , String magazineText){


        String magazine = "puerto rico is a great place you must hike far from town to find a secret "+
                "waterfall that i am an admirer of but note that it is not as hard as it seems "+
                "this is my advice for you";
        String noteText = "this is a secret note for you from a secret admirer"+
                "this is a note for you from a secret admirer";


    public void harmlessRansomNoteTestPass(String magazine, String noteText) {
        Hashtable<String, Integer> magazineHash = new Hashtable<String, Integer>();
        String isValid1 = "this is a note for you from a secret admirer";

        for (String word : magazine.split(" ")) {
            Integer count = magazineHash.get(word);
            if (count != null) {
                magazineHash.put(word, count + 1);
            } else {
                magazineHash.put(word, 1);
            }
        }
        return isValid1;
    }


        public void harmlessRansomNoteTestFail(String magazine, String noteText) {
            Hashtable<String, Integer> magazineHash = new Hashtable<String, Integer>();
            String isValid2 = "this is a secret note for you from a secret admirer";

        for(String word: noteText.split(" ")) {
            Integer count = magazineHash.get(word);

            if(count == null || count == 0) {
                isValid2 = "this is a secret note for you from a secret admirer";
                break;
            } else {
                magazineHash.put(word, count-1);
            }
        }
        return isValid2;
    }
}