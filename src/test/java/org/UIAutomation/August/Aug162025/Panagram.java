package org.UIAutomation.August.Aug162025;

public class Panagram {
    public static void main(String[] args) {

        String test = "I am an automation tester";
        test = test.toLowerCase();
        boolean result = checkForPangram(test);
        System.out.println("Is pangram: " + result);

    }


    public static boolean checkForPangram(String input)
    {
        if(input.length()<26)
        {
            return false;
        }
        else
        {
            for(char i= 'a'; i<='z';i++)
            {
                if(input.indexOf(i)<0)
                    return false;
            }
        }
        return true;

    }
}
