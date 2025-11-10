package opgave05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class opgave05 {
    public static void main(String[] args) {
        int talTilUdskrivning = 0;
        Scanner scanner = new Scanner(System.in);
        File outfile = new File("resources/opgave05.txt");
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
//      while (scanner.hasNext())
        while (talTilUdskrivning != -1) {
            talTilUdskrivning = scanner.nextInt();
            if (talTilUdskrivning != -1) {
                writer.print(talTilUdskrivning + " ");
                writer.flush();
            }
        }
        writer.close();
    }
}
