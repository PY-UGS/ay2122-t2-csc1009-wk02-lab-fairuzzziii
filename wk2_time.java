package Week2;

public class wk2_time {
    
    public static void main(String [] args){

        long totalMilli = System.currentTimeMillis();
        long totalSeconds = totalMilli/1000;
        long currentSeconds = totalSeconds%60;
        long totalMinutes = totalSeconds/60;
        long currentMinutes = totalMinutes%60;
        long totalHours = totalMinutes/60;
        long currentHours = totalHours%24;

        System.out.print("Current time is: " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " GMT");
    }
}

