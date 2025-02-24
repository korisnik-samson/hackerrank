package utils;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomTest {
    
    @NotNull
    public static List<Integer> getArray() {
        List<Integer> test = new ArrayList<>();

        // read from test.txt and add to test list
        try {
            File file = new File("src/main/resources/test.txt");
            Scanner scanner = new Scanner(file).useDelimiter(" ");

            while (scanner.hasNextInt()) test.add(scanner.nextInt());

            scanner.close();

            //for (int a : test) System.out.println(a);

        } catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }
        
        return test;
    }

    @NotNull
    public static List<Integer> getArray(String fileName) {
        List<Integer> test = new ArrayList<>();

        // read from test.txt and add to test list
        try {
            File file = new File("src/main/resources/" + fileName);
            Scanner scanner = new Scanner(file).useDelimiter(" ");

            while (scanner.hasNextInt()) test.add(scanner.nextInt());

            scanner.close();

            //for (int a : test) System.out.println(a);

        } catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }

        return test;
    }
    
}
