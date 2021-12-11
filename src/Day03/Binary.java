package Day03;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.ListIterator;

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

    public int LifeSupport(List<String> input){
        int strLen = input.get(1).length();
        int counts[]=new int[strLen];

        for (int n=0; n<strLen; n++) {
            ListIterator<String> listIterator = input.listIterator();
            while (listIterator.hasNext()) {
                counts[n] += Integer.parseInt(String.valueOf(listIterator.next().charAt(n)));
            }
        }

        // filter down the list
        List<String> oxGen = new ArrayList<String>(input);
        for (int n=0; n<strLen; n++) {
            if (oxGen.size() > 1){
                char x = counts[n] > oxGen.size() / 2 ? '1' : '0';
                oxGen = filterList(oxGen,n,x);
            }
        }

        List<String> scrub = new ArrayList<String>(input);
        for (int n=0; n<strLen; n++) {
            if (scrub.size() > 1){
                char x = counts[n] < scrub.size() / 2 ? '1' : '0';
                scrub = filterList(scrub,n,x);
            }
        }


        int ox = Integer.parseInt(oxGen.get(0).toString(),2);
        int sc = Integer.parseInt(scrub.get(0).toString(),2);

        return ox*sc;
    }

    public List<String> filterList(List<String> input, int pos, char valKeep){

        ListIterator<String> listIterator = input.listIterator();

        while (listIterator.hasNext()){
            if (listIterator.next().charAt(pos)!=valKeep){
                listIterator.remove();
            }
        }

        return input;
    }

}
