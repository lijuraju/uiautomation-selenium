package org.UIAutomation.August.Aug162025;

public class CopyConstructor {

    int a, b;

    CopyConstructor(int x , int y){
        a= x;
        b= y;
    }

    CopyConstructor(CopyConstructor cc)
    {
        this.a = cc.a;
        this.b = cc.b;
    }

    public static void main(String[] args) {


        CopyConstructor newObj = new CopyConstructor(10,20);
        CopyConstructor newObj2 = new CopyConstructor(newObj);

        System.out.println(newObj.a);
        System.out.println(newObj.b);
        System.out.println(newObj2.a);
        System.out.println(newObj.b);
    }

}
