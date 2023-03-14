package Lesson2.Complex;

public class ComplexNumber {
    public double realPart;
    public double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public void add(ComplexNumber a, ComplexNumber b){
        double newRealPart = a.getRealPart()+b.getRealPart();
        double newImaginaryPart = a.getImaginaryPart() + b.getImaginaryPart();
        ComplexNumber result = new ComplexNumber(newRealPart, newImaginaryPart);
        System.out.println(result);
    }
    public void sub(ComplexNumber a, ComplexNumber b){
        double newRealPart = a.getRealPart()-b.getRealPart();
        double newImaginaryPart = a.getImaginaryPart() - b.getImaginaryPart();
        ComplexNumber result = new ComplexNumber(newRealPart, newImaginaryPart);
        System.out.println(result);
    }
    public void mul(ComplexNumber a, ComplexNumber b){
        double newRealPart = a.getRealPart()*b.getRealPart() - a.getImaginaryPart() * b.getImaginaryPart();
        double newImaginaryPart = a.getImaginaryPart()*b.getRealPart() + a.getRealPart()*b.getImaginaryPart();
        ComplexNumber result = new ComplexNumber(newRealPart, newImaginaryPart);
        System.out.println(result);
    }
    public void abs(ComplexNumber a){
        double module = Math.sqrt(Math.pow(a.getRealPart(), 2) + Math.pow(a.getImaginaryPart(), 2));
        System.out.println(module);
    }


    @Override
    public String toString() {
        String result = null;
        if (imaginaryPart > 0) {
            result = ("ComplexNumber{" +
                    realPart + "+" +
                    imaginaryPart + "i" + '}');
        } else if (imaginaryPart < 0) {
            result = ("ComplexNumber{" +
                    realPart + "-" +
                    imaginaryPart + "i" + '}');
        } else {
            result = ("ComplexNumber{" +
                    realPart + '}');
        }

        return result;
    }
}
