package org.UIAutomation.February.Feb102026;

public class MumbaiBranch extends Bank{

    @Override
    public boolean validateDocument(String document)
    {
        if(document.equalsIgnoreCase("WB"))
            return true;
        else
            return false;
    }



}
