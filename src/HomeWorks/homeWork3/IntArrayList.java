package HomeWorks.homeWork3;

import java.util.Arrays;


public class IntArrayList implements IntList {
    //массив с которым будем работать
    private int[] array = new int[10];
    //переменная для финального вывода
    private int size = 0;

    //конструкторы
    public IntArrayList() {
    }

    public IntArrayList(int[] arr) {
        array = arr;
        size = arr.length;

    }

    @Override
    //эта часть кода не моя
    public void add(int number) {
        if (size >= array.length) {
            int newSize = array.length + 1; //вот тут исправил бесовщину чужую
            int[] newArr = new int[newSize];
            for (int i = 0; i < size; i++) {
                newArr[i] = array[i];
            }
            array = newArr;
        }
        array[size] = number;
        size++;
    }

    @Override
    //это мой супер-пупер вариант можно перевести на system.arrayCopy, но тут чисто мой полёт и он работает
    public boolean add(int index, int number) {
        //проверка ввода
        if (index >= 0 && index <= (array.length - 1)) {
            //увеличиваем размер нового массива на 1 от старого размера
            int newSize = array.length + 1;
            //создаем новый пустой
            int[] newArr = new int[newSize];

            //проходим все элементы массива слева от индекса
            for (int i = 0; i < index; i++) {
                newArr[i] = array[i];
            }
            //ставим на переданный индекс переданное значение
            newArr[index] = number;
            //проходим то что справа
            for (int i = index + 1; i < newSize; i++) {
                newArr[i] = array[i - 1];
            }
            size++;
            array = newArr;
            //возвращаем если всё прошло
            return true;
        }
        //не прокатило
        return false;
    }

    @Override
    public void clear() {
        size = 0;//бесовщина, но простая для вывода в конце

    }

    @Override
    public int get(int index) {
        //верификация
        if (index >= 0 && index <= (array.length - 1)) {
            return array[index];
        }
        return 0;

    }

    @Override
    public boolean isEmpty() {
        boolean state = false; //переменная для хранения состояния
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                state = false;
            }
        }
        //проверка состояния
        if (state == true) {
            return true;
        } else return false;

    }

    @Override
    //опять же моя отсебятина но рабоатет, убирает индекс и его значени и сдвигает справа налево после индекса
    public boolean remove(int index) {
        if (index >= 0 && index <= (array.length - 1)) {
            //временный массив
            int[] newArr = new int[array.length];
            //всё что до индекса переносится в новый массив
            for (int i = 0; i < index; i++) {
                newArr[i] = array[i];
            }
            //всё остальное сдвигается
            for (int i = index; i < array.length - 1; i++) {
                newArr[i] = array[i + 1];
            }

            size--;
            //присваиваем массивы от нового к старому боевому
            array = newArr;

            return true;
        }
        return false;
    }

    @Override
    //и тут моё произведение исскуств
    public boolean removeByValue(int value) {
        int index = 0;
        boolean state = false;
        for (int i = 0; i < array.length; i++) {
            //линейный поиск перебором, можно ускорить на бинарный, но зачем...
            if (array[i] == value) {
                index = i;
                state = remove(index);
            }
        }
        if (state == true) {
            return true;
        } else return false;
    }


    @Override
    public boolean set(int index, int element) {
        //верификация и присвение и тут я наследил
        if (index >= 0 && index <= (array.length - 1)) {
            array[index] = element;
            return true;
        } else return false;
    }

    @Override
    public int size() {
        //элементарно Ватсон
        return size;
    }

    @Override
    //тут скомунизжено и подправлено МНОЮ, но разобрался и познакомился с System.arraycopy
    public IntList subList(int fromIndex, int toIndex) {
        int[] arr = new int[(toIndex - fromIndex) + 1];//исправлена МНОЮ чужая ошибка в коде, теперь выводит правильно
        System.arraycopy(array, fromIndex, arr, 0, arr.length);
        IntList result = new IntArrayList(arr);
        return result;

    }

    //тут симпл димпл
    public int[] toArray() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = array[i];
        }
        return result;
    }

    //аналогично
    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

}
