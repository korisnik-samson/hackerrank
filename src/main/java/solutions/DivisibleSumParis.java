package solutions;

import java.util.List;

public class DivisibleSumParis {
    
    public static int divisibleSumParis(int n, int k, List<Integer> list) {
        int divisibleCount = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = list.get(i) + list.get(j);
                
                if (sum % k == 0) divisibleCount++;
            }
        }
        
        return divisibleCount;
    }

}
