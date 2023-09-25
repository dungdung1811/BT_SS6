package BT.bt3;

import java.util.Date;

public class StopWatch {
    private long startTime, endTime;

    public StopWatch() {

    }

    public StopWatch(long startTime) {
        this.startTime = System.currentTimeMillis();

    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsed (){
        return endTime - startTime;
    }
}

