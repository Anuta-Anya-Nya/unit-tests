import java.util.ArrayList;
import java.util.List;

public class Average {
    List<Integer> numbers = new ArrayList<>();
    public Average(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public double averageNumber() {
        int average = 0;
        int summa = 0;
        for (Integer el : numbers) {
            summa = summa + el;
        }
        average = summa / numbers.size();
        return average;
    }

}
