package org.UIAutomation.June.June092025;

public class SecondLargestInArray {





    public static void main(String[] args) {

        int[] number = {-5,-1,-9};
        int first = Integer.MIN_VALUE;
        int second =Integer.MIN_VALUE;

       for(int num : number){

           if (num>first){//true

               second = first;//1
               first = num;//9
           }

           else if(num > second && num != first){
               second = num;
           }
        }

       if(second == Integer.MIN_VALUE)
           System.out.println("There is no second largest eleent");
       else
           System.out.println("The second largest element is"+second);


    }
}
