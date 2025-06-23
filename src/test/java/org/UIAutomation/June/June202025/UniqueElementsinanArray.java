package org.UIAutomation.June.June202025;

public class UniqueElementsinanArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 4, 4, 5, 100};

        for (int i = 0; i < arr.length; i++) {
            // The unique flag needs to be reset for each element we check in the array
            // If we declared it outside the loop, it would retain its value from the previous iteration
            // This way, each element starts fresh with unique=true and then gets set to false if duplicates are found
            boolean unique = true;

            for (int j = 0; j < arr.length; j++) {

                if (i != j && arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique)
                System.out.println(arr[i]);

        }

    }

}

//public class UniqueElements {
//    public static void main(String[] args) {
//        int[] arr = {4, 5, 4, 6, 7, 5, 8, 7, 9};
//
//        System.out.println("Unique elements in the array are:");
//
//        for (int i = 0; i < arr.length; i++) {
//            boolean isUnique = true;
//
//            // Compare arr[i] with every other element
//            for (int j = 0; j < arr.length; j++) {
//                if (i != j && arr[i] == arr[j]) {
//                    isUnique = false;
//                    break;
//                }
//            }
//
//            if (isUnique) {
//                System.out.print(arr[i] + " ");
//            }
//        }
//    }
//}

