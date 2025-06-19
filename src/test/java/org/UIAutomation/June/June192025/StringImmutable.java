package org.UIAutomation.June.June192025;

public class StringImmutable {

        public static void main(String[] args) {

            System.out.println("--- Demonstrating String Immutability ---");

            // 1. Initial String Declaration
            String originalString = "Hello";
            System.out.println("1. Original String: " + originalString);
            System.out.println("   Memory Address (hash code) of originalString: " + System.identityHashCode(originalString));

            // 2. Modifying the String (or so it seems!)
            originalString = originalString + " World";
            System.out.println("\n2. String after concatenation: " + originalString);
            System.out.println("   Memory Address (hash code) of originalString now: " + System.identityHashCode(originalString));

            // 3. Another "modification"
            String anotherString = originalString.replace("World", "Java");
            System.out.println("\n3. String after replace: " + anotherString);
            System.out.println("   Memory Address (hash code) of anotherString: " + System.identityHashCode(anotherString));
            System.out.println("   Original String (originalString) still holds: " + originalString);
            System.out.println("   Memory Address (hash code) of originalString still: " + System.identityHashCode(originalString));

            // 4. Demonstrating the String Pool
            String s1 = "Test";
            String s2 = "Test";
            String s3 = new String("Test");

            System.out.println("\n--- Demonstrating String Pool and Immutability ---");
            System.out.println("4. s1: " + s1 + ", Memory Address: " + System.identityHashCode(s1));
            System.out.println("   s2: " + s2 + ", Memory Address: " + System.identityHashCode(s2)); // s2 points to the same object as s1 in the pool
            System.out.println("   s3: " + s3 + ", Memory Address: " + System.identityHashCode(s3)); // s3 is a new object outside the pool

            s1 = s1.toUpperCase(); // This will create a NEW String object "TEST"
            System.out.println("\n5. After s1.toUpperCase():");
            System.out.println("   s1 now: " + s1 + ", Memory Address: " + System.identityHashCode(s1));
            System.out.println("   s2 still: " + s2 + ", Memory Address: " + System.identityHashCode(s2)); // s2 remains unchanged, pointing to "Test"
        }
    }

