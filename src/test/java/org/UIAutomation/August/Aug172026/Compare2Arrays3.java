package org.UIAutomation.August.Aug172026;

import java.util.logging.Logger;

public class Compare2Arrays3 {


    public static void main(String[] args) {

        int[] ar1 = {1,2,3,4};
        int[] ar2 ={1,2,3,5};

  boolean isEqualFlag = true;

  if (ar1.length != ar2.length) {
      isEqualFlag = false;
  }
  else
      for(int i=0;i<=ar1.length-1;i++)
      {
          if(ar1[i] != ar2[i])
          {
              isEqualFlag = false;
              break;
          }
      }


 if(isEqualFlag)
 {
     System.out.println("Both arrays are equal");
 }
 else
     System.out.println("Both arrays are not equal");

    }
}
