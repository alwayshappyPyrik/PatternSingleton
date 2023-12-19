package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    private int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source, Filter filter) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        long count = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) > filter.treshold) {
                result.add(source.get(i));
                logger.log("Элемент " + "\"" + source.get(i) + "\"" + " проходит");
                count++;
            } else {
                logger.log("Элемент " + "\"" + source.get(i) + "\"" + " не проходит");
            }
        }
        logger.log("Прошло фильтр " + count + " элемента(ов) из " + source.size());
        logger.log("Выводим результат на экран");
        printListSource(result);
        return result;
    }

    void printListSource(List<Integer> result) {
        System.out.print("Отфильтрованный список: ");
        result.forEach(value -> System.out.print(value + " "));
        System.out.println();
    }
}
