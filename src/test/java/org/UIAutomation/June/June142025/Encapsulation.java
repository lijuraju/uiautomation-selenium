package org.UIAutomation.June.June142025;

public class Encapsulation {

   private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        if(newAge > 0){
            this.age = newAge;
        } else {
            System.out.println("Enter valid Age");
        }
    }

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
        obj.setName("Liju");
        obj.setAge(0);
        System.out.println("Name"+obj.getName());
        System.out.println("Age"+obj.getAge());
    }

}
