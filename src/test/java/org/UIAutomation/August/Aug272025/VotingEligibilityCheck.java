package org.UIAutomation.August.Aug272025;

public class VotingEligibilityCheck {

    public  static void checkAge(int age) throws InvalidAgeException {

        if(age < 18)
        {
            throw  new InvalidAgeException("Age must be above 18 on 27 Aug2025");
        }

        else
            System.out.println("Congrats.Please do voting");
    }

    public static void main(String[] args) {

        try {
            checkAge(18);
        } catch (InvalidAgeException e) {

            System.out.println("Exception occured"+e.getMessage());
        }
    }
}
