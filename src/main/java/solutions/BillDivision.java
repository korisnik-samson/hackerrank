package solutions;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class BillDivision {
    
    public static void bonAppetit(@NotNull List<Integer> bill, int k, int b) {
        int total = 0;
        
        for (int i = 0; i < bill.size(); i++) 
            if (i != k) total += bill.get(i);
        
        int annaShare = total / 2;
        
        if (annaShare == b) System.out.println("Bon Appetit");
        
        else System.out.println(b - annaShare);
    }
    
}
