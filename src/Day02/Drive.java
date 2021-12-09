package Day02;

public class Drive {
    private int horizontalPos = 0;
    private int depth = 0;
    private int aim =0;
    public int calcPositionP1(String[] input)
    {
        for (String str : input) {

            if (str.contains("forward")){
                int increment = Integer.parseInt(str.replaceAll("\\D+","") ); ;
                horizontalPos = horizontalPos + increment;
            }
            if (str.contains("down")){
                int depthIncrement = Integer.parseInt(str.replaceAll("\\D+","") ); ;
                depth = depth + depthIncrement;
            }
            if (str.contains("up")){
                int depthIncrement = Integer.parseInt(str.replaceAll("\\D+","") ); ;
                depth = depth - depthIncrement;
            }
        }

        return depth * horizontalPos;
    }

    public int calcPositionP2(String[] input) {
        for (String str : input) {
            if (str.contains("forward")){
                int increment = Integer.parseInt(str.replaceAll("\\D+","") ); ;
                horizontalPos = horizontalPos + increment;
                depth = depth + (aim * increment);
            }
            if (str.contains("down")){
                int increment = Integer.parseInt(str.replaceAll("\\D+","") ); ;
                aim += increment;
            }
            if (str.contains("up")){
                int increment = Integer.parseInt(str.replaceAll("\\D+","") ); ;
                aim -= increment;
            }
        }
        return depth * horizontalPos;
    }
}
