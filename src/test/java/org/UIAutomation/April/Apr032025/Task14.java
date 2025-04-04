package org.UIAutomation.April.Apr032025;

public class Task14 {

        public static void main(String[] args) {
            try {
                System.out.println("Trying to turn on the lamp...");
                boolean isSocketWorking = Math.random() > 0.5;
                if (!isSocketWorking) {
                    throw new Exception("The socket seems faulty!");
                }
                System.out.println("Lamp is now on!");
            } catch (Exception problem) {
                System.out.println("Oops! There was a problem: " + problem.getMessage());
                System.out.println("Let's check another socket.");
            } finally {
                System.out.println("Finished trying to turn on the lamp.");
            }
        }
    }

