import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BooksHashMap<K, V> implements MyMap<String, Books> {
    //объявляем мапу
    private Map<String, Books> map = new HashMap<>();

    //дефолтный конструктор
    public BooksHashMap() {
    }

    public BooksHashMap(int capacity) {
        map = new HashMap<>(capacity);
    }

    //метод для помещения в мапу
    public boolean put(String key, Books value) {
        if (isNull(key) || isNull(value)) {
            return false;
        }
        map.put(key, value);
        return true;
    }

    //метод для удаления из мапы
    public boolean remove(String key) {
        if (isNull(key)) {
            return false;
        }
        map.remove(key);
        return true;
    }

    //проверка на содержание ключа
    public boolean containsKey(String key) {
        if (isNull(key)) {
            return false;
        }
        return map.containsKey(key);
    }

    //получаем по ключу
    public Books get(String key) {
        if (isNull(key)) {
            return null;
        }
        return map.get(key);
    }

    //проверка на пустую
    public boolean isEmpty() {
        return map.isEmpty();
    }

    //очистка мапы
    public void clear() {
        map.clear();
    }

    //размер мапы
    public int size() {
        return map.size();
    }

    //преобразовываем в массив
    public Books[] toArray() {
        return map.values().toArray(new Books[0]);
    }

    //вывод итогов
    public String toString() {
        return map.toString();
    }

    //сравнение объектов
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BooksHashMap)) return false;
        BooksHashMap<?, ?> that = (BooksHashMap<?, ?>) o;
        return Objects.equals(map, that.map);
    }

    public int hashCode() {
        return Objects.hash(map);
    }

    private boolean isNull(Object o) {
        return o == null;
    }
}
