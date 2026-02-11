package org.UIAutomation.February.Feb102026;

public class Runner {

    public static void main(String[] args) {

        Bank b = new Bank();
        b.createAccount("EB");

        MumbaiBranch mb = new MumbaiBranch();
        mb.createAccount("EB");
    }


}
