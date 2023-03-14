package Lesson2.Complex;

public class Main {
    public static void main(String[] args) {
        ComplexNumber CN1 = new ComplexNumber(3, 2);
        ComplexNumber CN2 = new ComplexNumber(5,1);
        CN1.add(CN1, CN2);
        CN1.sub(CN1, CN2);
        CN1.mul(CN1, CN2);
        CN1.abs(CN1);
        System.out.println(CN1.toString());
    }
}
