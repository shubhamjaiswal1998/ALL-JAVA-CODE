import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    static void f1() {
        //////////////////////////////////////////////
        List<Integer> arr = Arrays.asList(4, 5, 6, 9);
        System.out.println(arr);
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        System.out.println("sum is " + sum);

        /////////////////////////////////////////////////////
        // m-2 for print list
        arr.forEach((Integer n) -> {
            System.out.print(n + " ");
        });

        // m-3 for print list with Stream
        System.out.println();
        System.out.println("after using stream ");
        Stream<Integer> ob = arr.stream();
        ob.forEach((Integer n) -> {
            System.out.print(n + " ");
        });

        // used some method of Stram Interface map,filter,reduce
        System.out.println();
        System.out.println("this is list2 ");
        List<Integer> arr2 = Arrays.asList(4, 5, 7, 6, 3, 10, 11, 13, 18);
        arr2.forEach(n -> System.out.print(n + " "));

        System.out.println();
        Stream<Integer> r2 = arr2.stream().filter((n) -> n % 2 == 0);
        System.out.println("result of r2 for even number ");
        r2.forEach((n) -> System.out.print(n + " "));

        System.out.println();
        System.out.println("result of r3 for double of even numbers");
        Stream<Integer> r3 = arr2.stream().filter((n) -> n % 2 == 0).map(n -> n * 2);
        r3.forEach((n) -> System.out.print(n + " "));

        System.out.println("after using reduce function it will add all element ");
        Integer r4 = arr2.stream().filter((n) -> n % 2 == 0).map(n -> n * 2).reduce(0, (c, e) -> c + e);
        System.out.println("result of r4 " + r4);
       
        System.out.println("sorted list");
        Stream<Integer> r5 = arr2.stream().sorted();
        r5.forEach(n -> System.out.print(n + " "));

    }

    public static void main(String[] args) {
        f1();
    }
}
