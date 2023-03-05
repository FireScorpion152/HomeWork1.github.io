package Lesson1;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String с = scanner.nextLine();
        String[][] array = new String[n][m];
        for(int i=0; i < array.length; i++){
            for (int j=0; j<array[i].length; j++){
                array[i][j] = с;
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}

