package Lesson2.StatsAccumulator;

public class Main {
    public static void main(String[] args) {
        StatsAccumulatorImpl s = new StatsAccumulatorImpl();
        s.add(2);
        s.add(5);
        s.add(61);
        s.add(-42);
        s.add(89);
        s.add(33);
        s.add(100000);
        System.out.println(s.getMin());
        System.out.println(s.getMax());
        System.out.println(s.getCount());
        System.out.println(s.getAvg());
    }
}
