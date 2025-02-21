package solutions;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TwoArrayPermutation {
    
    public static @NotNull String twoArrays(int k, @NotNull List<Integer> A, @NotNull List<Integer> B) {
        A.sort(Integer::compareTo);
        B.sort((a, b) -> b - a);
        
        for (int i = 0; i < A.size(); i++) if (A.get(i) + B.get(i) < k) return "NO";
        
        return "YES";
    }
    
}
