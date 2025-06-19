package org.UIAutomation.June.June192025;

public class ImmutableAnotherExample {
    public static void main(String[] args) {

        String s1 = "Liju";
        String s2 = "Liju";

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

        //Modifying the s1 and showing String Immutable
        s1 = s1 + " Raju";
        System.out.println("After change"+s1);
        System.out.println("New hashcode"+System.identityHashCode(s1));//hashcode changed for s1
        System.out.println(System.identityHashCode(s2));//Hashcode remains same for s2

        //String pool

        String a1 = "Reshma";
        String a2 = new String("Reshma");
        String a3 = new String("Reshma");

        System.out.println("hashcode of a1"+System.identityHashCode(a1));
        System.out.println("hashcode of a2"+System.identityHashCode(a2));
        System.out.println("hashcode of a3"+System.identityHashCode(a3));

    }
}
