package org.UIAutomation.April.Apr032025;

public class ArgumentPassing2 {

    public static void main(String[] abc) {

        String username = abc[0];
        String password = abc[1];

        System.out.println("Username:" + username);
        System.out.println("Password:" + password);
    }

    // Second way is to pass it thru command line
    // javac programName.java -> Compile the program
    // java programName Liju Abram -> Run the program
}
