package basic_generics;

public interface DataEntryInterface<K , V> {
    K getKey();
    V getValue();
}
