package org.UIAutomation.May.May242025;

public class characteroccurence {

    public static void main(String[] args) {

        String s = "Tata@111@s";
        s = s.toLowerCase();

        //counter
        int[] count = new int[256];

        for (int i = 0; i <= s.length() - 1; i++) {

            char ch = s.charAt(i);
            if (ch == ' ') {
                continue;
            }
            count[ch]++;
        }

        for (int i = 0; i < 256; i++) {
         if (count[i] > 1)
                System.out.println((char) i + " occurs" + count[i] + "times");
        }
    }


}
