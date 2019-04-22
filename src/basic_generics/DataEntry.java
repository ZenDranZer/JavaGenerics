package basic_generics;

public class DataEntry<K , V> implements DataEntryInterface<K, V> {
    private K key;
    private V value;

    public DataEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "DataEntry{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
