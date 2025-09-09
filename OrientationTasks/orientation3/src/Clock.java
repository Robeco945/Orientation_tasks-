public class Clock {
    private static Clock instance;
    private double time = 0.0;
    private Clock(){}
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }
    public double getTime() {
        return time;
    }
    public void setTime(double time){
        time = time;
    }

}
