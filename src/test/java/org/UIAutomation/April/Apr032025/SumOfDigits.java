package org.UIAutomation.April.Apr032025;

public class SumOfDigits {

    public static void main(String[] args) {

        int num = 123456;
        int sum =0;

        while(num!=0){

            int lastdigit = num%10;
            sum = sum + lastdigit;
            num = num/10;
        }
        System.out.println("The sum of digits is: " + sum);
    }
}
