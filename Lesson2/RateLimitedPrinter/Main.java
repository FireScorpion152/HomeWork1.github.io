package Lesson2.RateLimitedPrinter;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        RateLimitedPrinter rateLimitedPrinter = new RateLimitedPrinter(1);
        for(int i = 0; i < 1000; i++) {
            rateLimitedPrinter.print(String.valueOf(i));
        }
        long currentTime = System.currentTimeMillis();
    }

}
