package es.esy.djhans.iamdeveloper;

/**
 * Задача решается одним циклом. Напишите функцию, которая принимает массив числовых значений, вычисляет и возвращает наименьший элемент массива после минимального.
 * К примеру, для массива [5,5,4,3,2,1] это будет 2.
 * Ограничения:
 * Алгоритм не должен использовать другой массив (а также любые типы коллекций) и не должен никаким образом менять начальный массив.
 * Кейсы для проверки:
 * Для массива [5, 5, 5, 5, 5] или [5] на которое возвращается: null
 * Для массива [-1,-2, -3, -4, -5, -5] на которое возвращается: -4
 * Для массива [1, 1, 1, 1, 5, 5] или [5, 5, 1, 1, 1, 1] на которое возвращается: 5
 * Для массива [1, 2, 3] или [3, 2, 1] на которое возвращается: 2
 * Для массива [1, 3] на которое возвращается: 3
 */
public class SecondMin {

    public static Integer defineSecondMin(Integer[] mas) {
        Integer min = mas[0];
        Integer secondMin = null;
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < min) {
                secondMin = min;
                min = mas[i];
            } else if (mas[i] > min && (secondMin == null || mas[i] < secondMin)) {
                secondMin = mas[i];
            }
        }
        return secondMin;
    }

    public static void main(String[] args) {
        System.out.println(defineSecondMin(new Integer[]{1,2,3,4,5,5}).equals(2));
        System.out.println(defineSecondMin(new Integer[]{1,1,1,1,5,5}).equals(5));
        System.out.println(defineSecondMin(new Integer[]{5,5,1,1,1,1}).equals(5));
        System.out.println(defineSecondMin(new Integer[]{1,2,3}).equals(2));
        System.out.println(defineSecondMin(new Integer[]{1,3}).equals(3));
        System.out.println(defineSecondMin(new Integer[]{3,2,1}).equals(2));
        System.out.println(defineSecondMin(new Integer[]{-1,-2,-3,-4,-5,-5}).equals(-4));
        System.out.println(defineSecondMin(new Integer[]{1,10,2,3,4}).equals(2));
        System.out.println(defineSecondMin(new Integer[]{5}) == null);
        System.out.println(defineSecondMin(new Integer[]{5,5,5,5,5}) == null);
    }
}
