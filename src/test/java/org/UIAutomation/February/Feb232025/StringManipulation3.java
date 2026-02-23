package org.UIAutomation.February.Feb232025;

public class StringManipulation3 {

    public static void main(String[] args) {


        String s = "L@#iju12 R%@j^u34";
        //output = "Liju Raju 10"

        char[] c = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for( char ch : c)
        {
            if(Character.isLetter(ch) || ch == ' ')
            {
                sb.append(ch);
            }

            else if(Character.isDigit(ch))
                sum = sum + Character.getNumericValue(ch);


        }

        sb.append(' ');
        sb.append(sum);


        System.out.println(sb);

    }
}
