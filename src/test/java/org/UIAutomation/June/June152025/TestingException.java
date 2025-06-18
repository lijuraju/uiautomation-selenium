package org.UIAutomation.June.June152025;

public class TestingException {

    static void validate(String input) throws InvalidInputException {
        if(input == null || input.isEmpty()){
            throw new InvalidInputException("Input cannot be null or empty");
        }
        else
            System.out.println("Input Accepted");
    }

    public static void main(String[] args) {
        try {
            validate("");
        }catch (InvalidInputException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
