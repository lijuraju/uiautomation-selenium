package org.UIAutomation.May.May022025;

public class MethodOverriding {

    public  void Sleep(){
        System.out.println("Child is sleeping");
    }
}

class Elder extends MethodOverriding{
    @Override
    public void Sleep(){
        System.out.println("Elder is sleeping");
    }


}
