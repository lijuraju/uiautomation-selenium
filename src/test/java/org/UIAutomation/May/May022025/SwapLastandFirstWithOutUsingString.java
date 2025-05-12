package org.UIAutomation.May.May022025;

public class SwapLastandFirstWithOutUsingString {

    public static void main(String[] args) {

        int number = 1234;
        System.out.println(number);

        //Get the last digit
        int lastDigit = number%10;

        //Get the first digit
        int firstDigit= number;
        while(firstDigit >=10){
            firstDigit = firstDigit/10;
        }

        //MiddlePart
        int middlePart =  number%(int)Math.pow(10,String.valueOf(number).length()-1);
        middlePart = middlePart/10;


        //Reversed
        int reversed = lastDigit * (int)Math.pow(10,String.valueOf(number).length()-1)+middlePart*10+firstDigit;

        System.out.println(reversed);




    }
}
