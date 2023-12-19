package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int n = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int m = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> source = new ArrayList<>(n);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            source.add(random.nextInt(m));
        }
        printListSource(source);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int f = scanner.nextInt();
        Filter filter = new Filter(f);
        filter.filterOut(source, filter);
        logger.log("Завершаем программу");
    }

    static void printListSource(List<Integer> source) {
        System.out.print("Вот случайный список: ");
        source.forEach(value -> System.out.print(value + " "));
        System.out.println();
    }

}