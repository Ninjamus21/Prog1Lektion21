// java
package opgave07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class opgave07 {
    public static void main(String[] args) {
        File file = new File("resources/opgave07/reports.txt");

        try (Scanner scanner = new Scanner(file)) {
            int lineNo = 1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) {
                    lineNo++;
                    continue;
                }

                // split into tokens and parse to ints (works for any count per line)
                String[] parts = line.split("\\s+");
                int[] nums = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();

                // example: print or interact with the line-specific array
                System.out.println("Line " + lineNo + ": " + Arrays.toString(nums));

                lineNo++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public boolean safeOrNot(){
        for () {

        }
    }

}
