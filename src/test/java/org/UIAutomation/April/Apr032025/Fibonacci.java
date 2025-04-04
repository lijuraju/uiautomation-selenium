package org.UIAutomation.April.Apr032025;

public class Fibonacci {
    public static void main(String[] args) {

        int n = 10;
        int first = 0;
        int second = 1;
        int next;

        System.out.print("Fibonacci Series: " + first + ", " + second);

        for (int i=2; i<n; i++){
            next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
    }
}
