package org.UIAutomation.July.July022025;

public class OccuWord {

    public static void main(String[] args) {

        String str = "I am learning Java Java I";

        String[] s =    str.split(" ");

        int count = 1;

        for(int i=0;i<s.length;i++){

            for(int j=i+1;j<s.length;j++){

                if(s[i].equals(s[j]))
                {
                    count++;
                }
            }
        }
        for(String a : s){


        }
    }
}
