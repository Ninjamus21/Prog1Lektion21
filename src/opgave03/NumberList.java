package opgave03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberList {
    private ArrayList<Integer> numbers = new ArrayList<>();


    public ArrayList<Integer> getTxtnumber() {
        File file = new File("resources/numbers.txt");
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                numbers.add(scanner.nextInt());
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Filen blev ikke fundet");
        }
        return numbers;
    }

    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> numbers) {
        ArrayList <Integer> reversedList = numbers;
        Collections.reverse(reversedList);
        return reversedList;
    }
    public void printArrayList(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
