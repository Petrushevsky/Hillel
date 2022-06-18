public interface MyMap<K, V> {

    boolean put(K key, V value);

    boolean remove(K key);

    boolean containsKey(K key);

    V get(K key);

    boolean isEmpty();

    void clear();

    int size();

    V[] toArray();

    String toString();
}
