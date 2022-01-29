package Hillel.HomeWorksJavaIntroduction;

/**
 * ЗАДАНИЕ
 * В Японии числа 4 и 9 считаются несчастливыми. Вам нужно вывести только счастливые числа от 0 до 100.
 * Нужно исключить из вывода все числа, которые содержат 4 и 9.
 * (не должно быть цифр 4 и 9 не только в первом десятке, но и 14, 19, 24, 39, и т.д.)
 * 4.14.24.34.44
 * 9.19.29.39.49
 * <p>
 * /
 */
public class HomeWork12_LuckyNumbers {
    public static void main(String[] args) {

        int maxValue = 100;//задаём макс.значение, работает 100, как в условии задачи
        int[] unluckyNumbers = new int[39];//массив неудачных чисел

        fillUnluckyNumbers(maxValue, unluckyNumbers);//метод для заполнения массива неудачными числами

        printLuckyNumbers(maxValue, unluckyNumbers);//метод для вывода счастливых чисел без 9 и 4

    }

    private static void printLuckyNumbers(int maxValue, int[] unluckyNumbers) {
        boolean skip = false;
        //проверяем все числа
        System.out.println("Lucky numbers for Japan: ");
        for (int i = 0; i <= maxValue; i++) {
            //проверяем текущее число с числами со всего массива, есть ли в массиве неудачных данное число
            for (int j = 0; j < unluckyNumbers.length; j++) {
                if (unluckyNumbers[j] == i) {
                    //если нашли такое то даём знать об этом
                    skip = true;
                }
            }
            if (skip == true) {
                //нашли плохое число, возвращаем переменную в ложь и пропускаем вывод плохого числа
                skip = false;
                continue;
            }
            //выводим все удачные от 0 до 100
            System.out.println("Happy number: "+ i);


        }
        System.out.println("This is the end of Home Work! Have a nice day!");
    }
//все невезучие цифры формируем в циклах, без хардкода
    private static void fillUnluckyNumbers(int maxValue, int[] unluckyNumbers) {
        int index = 0;
        //4,14,24,34,44,54,64.....
        for (int i = 4; i <= maxValue; i += 10) {
            unluckyNumbers[index] = i;
            index++;
        }
        //40-48
        for (int i = 40; i <= maxValue && i < 49; i += 1) {
            unluckyNumbers[index] = i;
            index++;
        }
        //9,19,29,39,49,59....
        for (int i = 9; i <= maxValue; i += 10) {
            unluckyNumbers[index] = i;
            index++;
        }
        //90-99
        for (int i = 90; i <= maxValue && i < 100; i += 1) {
            unluckyNumbers[index] = i;
            index++;
        }
    }
}

