package Lesson2.RateLimitedPrinter;

import java.util.Date;

public class RateLimitedPrinter {
    public int interval;


    public RateLimitedPrinter(int interval) {
        this.interval = interval;
    }
     public void print(String message){
         if (true) {
             System.out.println(message);
             try {
                 Thread.sleep(interval);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
     }
}
