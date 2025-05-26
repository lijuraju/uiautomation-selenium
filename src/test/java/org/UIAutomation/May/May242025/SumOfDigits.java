package org.UIAutomation.May.May242025;

public class SumOfDigits {

    public static void main(String[] args) {

        int num = 1234501;
        int sum =0;

      while(num>0)
      {
          int lastdigit = num%10;
          sum = sum + lastdigit;
          num = num/10;
      }

        System.out.println("Sum of digits"+sum);
    }
}
