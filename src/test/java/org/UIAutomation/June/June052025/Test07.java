package org.UIAutomation.June.June052025;

public class Test07 {

    public static void main(String[] args) {

        for(int i=0; i<5; i++)
        {
            if (i == 3)
                continue;

            if (i == 4)
                break;
            System.out.println(i);
        }
    }
}


