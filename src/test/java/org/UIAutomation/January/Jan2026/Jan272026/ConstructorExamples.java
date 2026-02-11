package org.UIAutomation.January.Jan2026.Jan272026;

public class ConstructorExamples {

    int a;
    String name;

    //Default constructor
    ConstructorExamples() {
      a=10;
      name = "Abram";
    }

    //Parameterised constructor
    ConstructorExamples(String name){
        this.name = name;
    }

   //Copy constructor
    ConstructorExamples(ConstructorExamples ref)
    {
        this.name = ref.name;
    }

    public static void main(String[] args) {

        ConstructorExamples c1 = new ConstructorExamples("Liju");
        System.out.println("value of a "+ c1.a);
        System.out.println("value of name "+ c1.name);

        ConstructorExamples c2 = new ConstructorExamples(c1);
        System.out.println("value of a "+ c1.a);
        System.out.println("value of name "+ c1.name);

    }
}
