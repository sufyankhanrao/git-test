package test.githubactions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        String input = "Output is -> " + Math.random();
        System.out.println(input);
        writeToTextFile("file.txt", input);
    }


    public static void writeToTextFile(String fileName, String content) throws IOException {
        Files.write(Paths.get(fileName), content.getBytes(), StandardOpenOption.CREATE);
    }
}
