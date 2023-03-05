package Lesson1;

import java.util.Scanner;
import java.util.Random;

public class Guess {
    public static void main(String[] args) throws Exception {
        int number = new Random().nextInt(100); // здесь загадывается число от 0 до 99
        int maxAttempts = 10; // здесь задается количество попыток
        System.out.println("Я загадал число. У тебя " + maxAttempts + " попыток угадать.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < maxAttempts+1; i++) {
            int n = scanner.nextInt();
            if( i < maxAttempts+1){
                if (n < number) {
                    System.out.println("Моё число больше. Осталось " + (maxAttempts - i) + " попыток");
                } else if (n > number) {
                    System.out.println("Моё число меньше. Осталось " + (maxAttempts - i) + " попыток");
                } else System.out.println("Ты угадал с " + i + " попытки.");
                if (n == number) {
                    return;
                }
            }
        }System.out.println("Ты не угадал");
    }
}

