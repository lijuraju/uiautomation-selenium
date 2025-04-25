package org.UIAutomation.April.Apr032025;

public class ArgumentPrinter {

    public static void main(String[] args) {
        System.out.println("Argument Printer Program");
        System.out.println("-----------------------");
        System.out.println("Number of arguments received: " + args.length);

        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("No arguments were provided.");
        }
    }
}
