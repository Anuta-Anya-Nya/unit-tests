import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AverageTest {

    // проверка вычисления среднего значения
    @Test
    void checkAverage() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Average average = new Average(list);
        assertThat(average.average()).isEqualTo(3);
    }

    // проверка, что среднее значение первого списка больше
    @Test
    void firstAverageMore() {
        AverageCompare averageCompare = new AverageCompare();

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        Average listOne = new Average(list1);
        Average listTwo = new Average(list2);

        assertThat(averageCompare.compAverage(listOne, listTwo)).isEqualTo("Первый список имеет большее среднее значение");
    }

    // проверка, что среднее значение второго списка больше
    @Test
    void secondAverageMore() {
        AverageCompare averageCompare = new AverageCompare();

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Average listOne = new Average(list1);
        Average listTwo = new Average(list2);

        assertThat(averageCompare.compAverage(listOne, listTwo)).isEqualTo("Второй список имеет большее среднее значение");
    }

    // проверка, что средние значения равны
    @Test
    void equalAverageMore() {
        AverageCompare averageCompare = new AverageCompare();

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Average listOne = new Average(list1);
        Average listTwo = new Average(list2);

        assertThat(averageCompare.compAverage(listOne, listTwo)).isEqualTo("Средние значения равны");
    }
}