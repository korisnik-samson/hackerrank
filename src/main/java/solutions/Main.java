package solutions;

import utils.CustomTest;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> test = (ArrayList<Integer>) CustomTest.getArrayFromFile("test.txt");
        
        // System.out.println("Test: " + Arrays.toString(test.toArray()));
        
        System.out.println("Migratory Birds: " + MigratoryBirds.migratoryBirds(test));
        
    }

}
