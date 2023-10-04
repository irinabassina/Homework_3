// Анализатор списка
// Напишите функцию analyzeNumbers, которая принимает на вход целочисленный список arr и:
// Сортирует его по возрастанию и выводит на экран
// Находит минимальное значение в списке и выводит на экран - Minimum is {число}
// Находит максимальное значение в списке и выводит на экран - Maximum is {число}
// Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
// Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers
// принимает на вход один параметр:

// Integer[] arr - список целых чисел

// Пример
// arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
// analyzeNumbers(arr)

// [1, 2, 3, 4, 5, 6, 7, 8, 9]
// Minimum is 1
// Maximum is 9
// Average is = 5

// import java.util.*;

// import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class Answer{
    public static void analyzeNumbers(Integer[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(List.of(arr));
        list.sort(Comparator.naturalOrder());
        int min = Collections.min(list);
        int max = Collections.max(list);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(list);
        System.out.printf("Minimum is %s\n", min);
        System.out.printf("Maximum is %s\n", max);
        System.out.printf("Average is = %s", sum/list.size());
    }
}
// public class Task_3 {
//     public static void main(String[] args) {
//         Integer[] arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
//         System.out.println(Arrays.toString(arr));
//         Answer answer = new Answer();
//         answer.analyzeNumbers(arr);
//     }
// }






