package Lesson2.StatsAccumulator;

public class StatsAccumulatorImpl implements StatsAccumulator {
    int n;
    int min = 0;
    int max = 0;
    int count = 0;
    int avg;


    public int getN() {
        return n;
    }

    public int setN(int n) {
        this.n = n;
        return n;
    }

    @Override
    public void add(int value) {
        n=setN(value);
        avg=avg+value;
        if(value<min){
            min=value;
        }
        if(value>max){
            max=value;
        }
        count++;
    }

    @Override
    public int getMin() {
        return min;
    }
    @Override
    public int getMax() {
        return max;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public Double getAvg() {
        avg=avg/count;
        return (double) avg;
    }
}
