package org.UIAutomation.June.June272025;

public class CountOfOccurenceInString {

    public static void main(String[] args) {
        String str = "Java is a programming language";
        char c = 'i';
        int count =0;

        for(int i=0;i<str.length();i++){

            if(str.charAt(i) == c){
                count++;
            }
        }

        System.out.println(c + " occured " + count + " times");

    }
}
