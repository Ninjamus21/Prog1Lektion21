package opgave04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class opgave04 {
    public static void main(String[] args) {
        File outfile = new File("resources/opgave04.txt");
        try {
            outfile.createNewFile();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return;
        }
        PrintWriter writer;
        try {
            writer = new PrintWriter(outfile);
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return;
        }
        for (int index = 1; index <= 100; index++) {
            if (index % 2 == 0) {
                writer.print(index + " ");
            }
        }
        writer.close();
    }
}
