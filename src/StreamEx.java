import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        String[] arr = new String[]{"하나", "둘", "셋", "넷"};

        //배열에서 스트링 생성
        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // 배열에서 특정 부분만을 이용한 스트림생성
        Stream<String> stream2 = Arrays.stream(arr, 1, 3);
        stream2.forEach(e -> System.out.print(e + " "));

        System.out.println(        );
        Stream<Integer> intStream = Arrays.asList(1,2,3,4,5,6,7).stream();
        //Stream<String> stringStream = intStream.map(e->String.valueOf(e));

        List<Integer> oddNumbers = intStream.filter(e->e%2==1)
                .collect(Collectors.toList());
        System.out.println(oddNumbers);

        intStream = Arrays.asList(1,2,6,6,6,6,6,6,18,18,18,18,12,12,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20).stream();
        List<Integer> evenNumber = intStream.filter(e->e%2==0)
                .collect(Collectors.toList());
        System.out.println(evenNumber);

        intStream = Arrays.asList(1,2,6,6,6,6,6,6,18,18,18,18,12,12,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,24,30,36,42).stream();
        List<Integer> result = intStream.filter(e->e%2==0)
                .filter(e->e%3==0)
                .sorted()
                .distinct()
                .skip(2)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
