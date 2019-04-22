package basic_generics;

public class Vessel<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nVessel{" +
                "value=" + value +
                '}' +
                " Type : " + value.getClass().getSimpleName();
    }
}
