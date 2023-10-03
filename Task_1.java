// Сортировка слиянием.
//Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел a
//и реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.
//Пример
//a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]

// import java.util.Arrays;

public class Task_1 {
    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
    if(a == null) {
            return  null;
        }
        if(a.length < 2) {
            return  a;
        }
        int[] left = new int[a.length/2]; // Разбиваем массив на подмасиивы
        int[] right = new int[a.length - a.length/2];
        System.arraycopy(a,0, left,0, a.length/2);// Копируем подмассивы
        System.arraycopy(a, a.length/2, right, 0, a.length - a.length/2);
        left = mergeSort(left);// Рекурсивно уменьшаем
        right = mergeSort(right);
        return mergeArray(left, right);
    }


    private static int[] mergeArray(int[] a1, int[] a2){
        int[] result = new int[a1.length + a2.length];
        int a1Length = a1.length;
        int a2Length = a2.length;
        int i = 0, j = 0, k = 0;
        while (i < a1Length && j < a2Length) {
            if (a1[i] <= a2[j]){
                result[k] = a1[i];
                i ++;
            } else {
                result[k] = a2[j];
                j ++;
            }
            k ++;
        }
        while (i < a1Length){
            result[k] = a1[i];
            i ++;
            k ++;
        }
        while (j < a2Length){
            result[k] = a2[j];
            j ++;
            k ++;
        }
        return result;
    }
}
    
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
// class Printer { 
//     public static void main(String[] args) { 
//         int[] a;

//         if (args.length == 0) {
//         // При отправке кода на Выполнение, вы можете варьировать эти параметры
//             a = new int[]{5, 1, 6, 2, 3, 4};
//         } else {
//             a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
//         }

//         MergeSort answer = new MergeSort();
//         String itresume_res = Arrays.toString(answer.mergeSort(a));
//         System.out.println(itresume_res);
//     }
// }


