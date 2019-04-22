package complex_generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        Driver driver  = new Driver();
        List<Number> numbers = new ArrayList<>();
        driver.addElementsToList(numbers);
        driver.sumTheElementsInList(numbers);

    }

    public void sumTheElementsInList(List<? extends Number> numbers){
        double sum = 0.0;

        for (Number n:numbers) {
            sum += n.doubleValue();
            System.out.println(n.getClass().getSimpleName());
        }
        System.out.println(sum);
    }

    public void addElementsToList(List<? super Integer> number){
        number.add(1);
        number.add(122);
        number.add(12323);
    }

}
