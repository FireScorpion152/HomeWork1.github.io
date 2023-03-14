package Lesson2.SnilsValidator;

public class Snils implements SnilsValidator {
    public String number;
    public String control;

    public Snils(String number, String control) {
        this.number = number;
        this.control = control;
    }

    @Override
    public boolean validate() {
        int check = 0;
        int multSum = 0;
        if (number.length() == 9 && control.length() == 2) {
            for (int i = 0; i < number.length(); i++) {
                multSum = multSum + (Integer.parseInt(number.valueOf(number.charAt(i))) * (number.length() - i));
            }
            check = multSum % 101;
            if (multSum == 100 || multSum == 101) {
                check = 00;
            } else if (multSum == 102) {
                check = 01;
            }
            if (Integer.parseInt(control)==check) {
                return true;
            } else return false;
        }else return false;
    }
}

