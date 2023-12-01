import java.util.ArrayList;
import java.util.List;
public class AverageCompare {

    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();


    public String compAverage(Average list1, Average list2) {

        if (list1.averageNumber() > list2.averageNumber()) {
            return "Первый список имеет большее среднее значение";
        } else if (list1.averageNumber() < list2.averageNumber()) {
            return "Второй список имеет большее среднее значение";
        }
        return "Средние значения равны";
    }
}
