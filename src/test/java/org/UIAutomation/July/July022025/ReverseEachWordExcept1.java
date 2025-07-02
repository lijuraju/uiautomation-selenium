package org.UIAutomation.July.July022025;

public class ReverseEachWordExcept1 {
    public static void main(String[] args) {

        String str = "John Mathew Daniel";
        String[] a = str.split(" ");
        String rev = "";

        for(String s : a){

            if(!s.equals("Daniel")){

                for(int i=s.length()-1;i>=0;i--){
                    rev = rev +s.charAt(i);
                }
                rev = rev + " ";
            }
            else
                rev = rev + s +" ";

        }
        System.out.println(rev);
    }
}
