package org.UIAutomation.May.May022025;

public class NoOfOccurenceInAArray {

        public static void main(String[] args) {
            int a[] = {1, 1, 2};
            boolean visited[] = new boolean[a.length];

            for (int i = 0; i < a.length; i++) {
                if (visited[i]) continue;

                int count = 1;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        visited[j] = true;
                    }
                }

                System.out.println("Number " + a[i] + " occurs " + count + " times.");
            }
        }
    }


