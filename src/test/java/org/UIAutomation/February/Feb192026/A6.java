package org.UIAutomation.February.Feb192026;

public class A6 {

    public static void main(String[] args) {

        int[] a = {1,1,-1,-1,0,100,2};

        for(int i =0;i<a.length;i++)
        {
            for(int j= i+1; j<a.length;j++)
            {
                if(a[i] == a[j])
                {
                    System.out.println("Duplicate " +a[j]);
                }
            }
        }
    }
}
