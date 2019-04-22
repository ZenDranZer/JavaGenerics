package intermediate_generics;

public class Holder<T> {
    private T value;

    public Holder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public <S> void compare(S sValue){
        System.out.println("T : " + value.getClass().getName());
        System.out.println("S : " + sValue.getClass().getName());
    }
}
