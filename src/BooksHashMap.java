import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BooksHashMap<K, V> implements MyMap<String, Books>{
    private Map<String, Books> map = new HashMap<>();

    public BooksHashMap() { }
    public BooksHashMap(int capacity) {
        map = new HashMap<>(capacity);
    }

    public boolean put(String key, Books value) {
        if(isNull(key) || isNull(value)) {
            return false;
        }
        map.put(key, value);
        return true;
    }

    public boolean remove(String key) {
        if(isNull(key)) {
            return false;
        }
        map.remove(key);
        return true;
    }

    public boolean containsKey(String key) {
        if(isNull(key)) {
            return false;
        }
        return map.containsKey(key);
    }

    public Books get(String key) {
        if(isNull(key)) {
            return null;
        }
        return map.get(key);
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public void clear() {
        map.clear();
    }

    public int size() {
        return map.size();
    }

    public Books[] toArray() {
        return map.values().toArray(new Books[0]);
    }

    public String toString() {
        return map.toString();
    }

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
