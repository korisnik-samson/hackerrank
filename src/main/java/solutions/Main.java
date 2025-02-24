package solutions;

import utils.CustomTest;

import java.util.List;

public class Main {

    public static void main(String[] args) {
    
        int s = 37455, t = 87275, a = 35609 , b = 89610, m = 73201 , n = 77971;

        List<Integer> apples = CustomTest.getArray("apples.txt");
        
        List<Integer> oranges = CustomTest.getArray("oranges.txt");

        System.out.println(apples.size());
        System.out.println(oranges.size());

        ApplesAndOranges.print(ApplesAndOranges.countApplesAndOranges(s, t, a, b, apples, oranges));
    }

}
