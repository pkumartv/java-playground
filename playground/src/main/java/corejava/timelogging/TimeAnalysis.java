package corejava.timelogging;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class TimeAnalysis
{
    private static final Clock clock=Clock.systemUTC();

    public static void main(String[] args) {

        Instant start =Instant.now();

        //System.out.println(clock.offset(clock, offsetDuration));
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Instant end= Instant.now();
        Duration timeElaspsed= Duration.between(start, end);
        long timeElaspsedinMillis= timeElaspsed.toMillis();
        long timeElaspsedinNanos=timeElaspsed.toNanos();
        System.out.println(timeElaspsed + " in Millis "+ timeElaspsedinMillis+ " in Nanos "+timeElaspsedinNanos);

        
    }

}