package org.UIAutomation.June.June152025;

public class Testing {
    static int age;
    static void age(int age) throws InvalidAgeException {
        if (age>18){
            System.out.println("You are ready for voting");
        }

        else
            throw new InvalidAgeException("Please be patient!");
    }

    public static void main(String[] args)  {

        try {
            Testing.age(2);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
