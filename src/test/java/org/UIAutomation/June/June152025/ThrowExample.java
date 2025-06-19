package org.UIAutomation.June.June152025;

public class ThrowExample {

        public static void divide(int a, int b) {
            if (b == 0) {
                // Throwing a built-in exception manually
                throw new ArithmeticException("Cannot divide by zero");
            } else {
                System.out.println("Result: " + (a / b));
            }
        }

        public static void main(String[] args) {
            divide(10, 0); // This will throw ArithmeticException
        }
    }



