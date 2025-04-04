package org.UIAutomation.April.Apr032025;

public class PalindromeNumber2 {
    public static void main(String[] args) {


        int num = 2550;

        int reveresednumber = 0;

        int originalnumber = num;

        while(num!=0){

            int lastdigit = num%10;
            reveresednumber = reveresednumber*10 + lastdigit;
            num = num/10;
        }
        if(originalnumber == reveresednumber){
            System.out.println(originalnumber + " is a palindrome number.");
        }
        else{
            System.out.println(originalnumber + " is not a palindrome number.");
        }
    }
}
