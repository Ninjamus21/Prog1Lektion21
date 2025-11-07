package opgave02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class opgave02 {
    public static void main(String[] args) {
        File file = new File("resources/numbers.txt");
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                int number = scanner.nextInt();
                System.out.println("tal fra resources: " + number + " ganget med 2: " + (number * 2));
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Filen blev ikke fundet");
        }
    }
}
