package Day03;

import java.util.BitSet;

public class Binary {

    private String gamma = "";
    private String epsilon= "";
    private StringBuilder gam = new StringBuilder();
    private StringBuilder eps= new StringBuilder();

    public long Power(String[] input)
    {
        int strLen = input[1].length();
        int[] counts = new int[strLen];

        for (String str : input) {
            for (int n=0; n<strLen; n++)
            {
                counts[n] += Integer.parseInt(String.valueOf(str.charAt(n)));

            }
        }
        for (int n=0; n<strLen; n++)
        {

            char x = counts[n] > input.length / 2 ? '1' : '0';
            gam.append(x);

            char y = counts[n] < input.length / 2 ? '1' : '0';
            eps.append(y);
        }

        int g = Integer.parseInt(gam.toString(),2);
        int e = Integer.parseInt(eps.toString(),2);

        return g * e;
    }

}
