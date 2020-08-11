package Misc.Generics.src;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

    static double sumOfNumberList(List<? extends Number> numbers) {
        double sum = 0.0;
        for(Number number:numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    static void addACoupleOfValues(List<? super Number> numbers) {
        numbers.add(1);
        numbers.add(1.0);
        numbers.add(1.0f);
        numbers.add(1l);
    }

    public static void main(String[] args) {
        List<Number> emptyList = new ArrayList<>();
        addACoupleOfValues(emptyList); 
        System.out.println(emptyList);

        System.out.println(sumOfNumberList(List.of(1, 2, 3, 4, 5)));
        System.out.println(sumOfNumberList(List.of(1.1, 2.1, 3.1, 4.1, 5.1)));
        System.out.println(sumOfNumberList(List.of(1l, 2l, 3l, 4l, 5l)));


        MyCustomList<String> listString = new MyCustomList<>();
        listString.addElement("Element 1");
        listString.addElement("Element 2");
        String value = listString.get(0);

        System.out.println(listString);
        System.out.println(value);

        MyCustomList<Integer> listInteger = new MyCustomList<>();
        listInteger.addElement(Integer.valueOf(5));
        listInteger.addElement(Integer.valueOf(7));
        Integer number = listInteger.get(0);

        System.out.println(listInteger);
        System.out.println(number);

    }
}