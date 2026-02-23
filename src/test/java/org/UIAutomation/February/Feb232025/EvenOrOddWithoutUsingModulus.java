package org.UIAutomation.February.Feb232025;

public class EvenOrOddWithoutUsingModulus {

    public static void main(String[] args) {


        int num =6;

        while(num>1)
        {
            num = num-2;
        }

        if(num==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}
