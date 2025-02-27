package solutions;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class SubArrayDivision {

    public static int birthday(@NotNull List<Integer> s, int d, int m) {
        int count = 0;

        for (int i = 0; i < s.size() - m + 1; i++) {
            int sum = 0;

            for (int j = i; j < i + m; j++) sum += s.get(j);

            if (sum == d) count++;
        }

        return count;
    }

}
