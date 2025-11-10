package opgave06;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("resources/opgave06/data.txt");
        System.out.println(maximum(file));
    }
    public static int maximum(File file){
        int highestNumber = 0;
        Scanner scanner = null;
        try{
            scanner = new Scanner(file);
        } catch (FileNotFoundException exception){
            System.out.println(exception.getMessage());
        } catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }
        while(scanner.hasNext()){
            if(scanner.nextInt() > highestNumber){
                highestNumber = scanner.nextInt();
            }
        }
        scanner.close();

        return highestNumber;
    }
}



