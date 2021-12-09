package Day01;

public class Sonar {
    private int depth =0;
    private int prevNum =-1;
    private int count = 0;
    int numTimesP1(int[] input)
    {
        for (int num : input) {
            if (prevNum != -1 & num > prevNum){
                count+=1;
            }
            prevNum = num;
        }
        return count;
    }

    int numTimesP2(int[] input){
        return 0;
    }

}
