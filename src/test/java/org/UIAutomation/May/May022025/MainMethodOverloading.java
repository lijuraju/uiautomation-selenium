package org.UIAutomation.May.May022025;

public class MainMethodOverloading {

    public static void main(String[] args){

      String username = args[0];
      String password = args[1];
      main(10);
      main("Hello");




    }

    public static void main(int a){
        System.out.println(a);
    }
    public static void main(String name){
        System.out.println(name);
    }
}
