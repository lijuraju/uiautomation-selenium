package org.UIAutomation.April.Apr032025;

public class CountOfOccurence2 {
    public static void main(String[] args) {
        String s = "Tata Sons ";

        //s = s.toLowerCase();

        int[] count = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == ' ')
            {
                continue;
            }
            //ch is converted into corresponding ASCI value and incrementd
            count[ch]++;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.println((char) i + " occurs " + count[i] + " times");
            }
        }

    }
}
