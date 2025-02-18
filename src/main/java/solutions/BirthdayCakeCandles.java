package solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(@NotNull List<Integer> candles) {
        candles.sort(Collections.reverseOrder());
        
        int count = 0;

        for (Integer candle : candles) if (Objects.equals(candles.get(0), candle)) count++;
        
        return count;
    }
    
}
