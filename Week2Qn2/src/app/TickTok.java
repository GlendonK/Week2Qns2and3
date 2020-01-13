package app;

public class TickTok {
    float tickSec, timeMin, timeHour;
    int currentSec, currentMin, currentHour;

    public TickTok(){
        float tickMilis = System.currentTimeMillis();
        tickSec = tickMilis / 1000;
        timeMin = tickSec / 60;
        timeHour = timeMin / 60;
        currentSec = (int) (tickSec % 60);
        currentMin = (int) (timeMin % 60);
        currentHour = (int) (timeHour % 24);
        System.out.println("Current time is: " + currentHour + ":" 
        + currentMin + ":" + currentSec + " GMT");

    }

    /*public void getTimeSec(){
        
        System.out.println("Time in Seconds: " + (int)tickSec + " sec");
    }

    public void getCurrentSec(){

        currentSec = (int) (tickSec % 60);
        System.out.println("Current time in Seconds: " + currentSec + " sec");

    }

    public void getTimeMin(){

        
        System.out.println("Time in Minutes: " + timeMin + " min");
    }

    public void getCurrentMinute(){
        int currentMin = (int) timeMin % 60;
        System.out.println("Current time in min: " + currentMin + " min");
    }

    public void getTimeHour(){
        
        System.out.println("Time in Hours: " + timeHour + " h");
    }
    public void getCurrentHour(){

        int currentHour = (int) timeHour % 24;
        System.out.println("Current hour: " + currentHour + "H");

    }*/





}
