package Day01;

public class Sonar {
    private int depth =0;
    private int prevNum =-1;
    private int count = 0;
    int numTimesP1(int[] input)
    {
        count = 0;
        for (int num : input) {
            if (prevNum != -1 & num > prevNum){
                count+=1;
            }
            prevNum = num;
        }
        return count;
    }

    int numTimesP2(int[] input)
    {
        int[] output = convertToThreeMeasWindow(input);
        return numTimesP1(output);
    }

    int[] convertToThreeMeasWindow(int[] input){
        count = 0;
        int[] output = new int[input.length - 2];
        int n=0;
        for (int i=2; i<input.length; i++) {

            output[n]=input[i]+input[i-1]+input[i-2];
            n+=1;

        }
        return output;
    }

}
