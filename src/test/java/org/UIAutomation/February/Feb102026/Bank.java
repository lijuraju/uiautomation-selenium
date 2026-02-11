package org.UIAutomation.February.Feb102026;

public class Bank {

    private static final String BANK_NAME = "HDFC";

    public void createAccount(String document){

        if(validateDocument(document)) {
            System.out.println("Creating account with document...." + document);
            System.out.println("Account created successfully!!");
        }

        else
            System.out.println("Invalid Document type");
    }

    public boolean validateDocument(String document)
    {
        if(document.equalsIgnoreCase("EB"))
            return true;
        else
            return false;
    }
}
