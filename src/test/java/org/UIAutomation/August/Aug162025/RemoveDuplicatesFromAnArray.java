package org.UIAutomation.August.Aug162025;

public class RemoveDuplicatesFromAnArray {

    public static void main(String[] args) {

        int[] array = {1,1,2,2,3};
        int[] temp = new int[array.length];
        int index = 0;

        for(int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            
            for(int j = 0; j < index; j++) {
                if(array[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if(!isDuplicate) {
                temp[index] = array[i];
                index++;
            }
        }
        
        for(int i = 0; i < index; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
