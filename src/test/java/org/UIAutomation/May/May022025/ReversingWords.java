package org.UIAutomation.May.May022025;

public class ReversingWords {

    public static void main(String[] args) {

        String str = "Liju Raju";

        String[] words = str.split("\\s+");
//        for(int i=0;i<=words.length-1;i++){
//            System.out.println(words[i]);
//        }

        int wordCount = words.length;

        String[] reversedWords = new String[wordCount];

        for (int i = 0; i < wordCount; i++) {
            reversedWords[i] = words[wordCount - 1 - i];
            System.out.println(reversedWords[i]);
        }
        String reversedString = "";
        for (int i = 0; i < wordCount; i++) {
            String word = reversedWords[i];
            String reversedWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord += word.charAt(j);
            }
            reversedString += reversedWord;
            if (i < wordCount - 1) {
                reversedString += " ";
            }

            System.out.println(reversedString);
        }
    }
}
