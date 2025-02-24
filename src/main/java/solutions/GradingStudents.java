package solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class GradingStudents {
    
    @Contract("_ -> param1")
    public static List<Integer> gradingStudents(@NotNull List<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {
            int grade = grades.get(i);
            
            if (grade >= 38) {
                int nextMultipleOfFive = (grade / 5 + 1) * 5;
                
                if (nextMultipleOfFive - grade < 3) grades.set(i, nextMultipleOfFive);
            }
        }
        return grades;
    }

    @Contract("_ -> param1")
    public static List<Integer> gradingStudentsFE(@NotNull List<Integer> grades) {
        for (int grade : grades) {
            if (grade >= 38) {
                int nextMultipleOfFive = (grade / 5 + 1) * 5;
                
                if (nextMultipleOfFive - grade < 3) grades.set(grades.indexOf(grade), nextMultipleOfFive);
            }
        }
        
        return grades;
    }

}
