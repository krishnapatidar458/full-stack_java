package FunctionalProgramming;

import java.util.List;

public class ExcerciceFunctionalProgramming {
    public static void main(String[] args) {
//        printOdd(List.of(9,7,5,7,6,8,6,4,3,4,3));
//        printCourse(List.of("Spring","Spring Boot", "API","PCF","Azure","Docker","Kubernetes"));
        printSpring(List.of("Spring","Spring Boot", "API","PCF","Azure","Docker","Kubernetes"));
//        printCourseGreaterLengthThenFour(List.of("Spring","Spring Boot", "API","PCF","Azure","Docker","Kubernetes"));


    }

    private static void printCourseGreaterLengthThenFour(List<String> Course4Length) {
        Course4Length.stream()
                .filter(course -> course.length()>4)
                .forEach(System.out::println);
    }

    private static void printSpring(List<String> springs) {
        springs.stream()
//                .filter(spring -> spring.contains("Spring"))
                .map(spring -> spring.length())
                .forEach(System.out::println);
    }

    private static void printCourse(List<String> Course) {
        Course.stream()
                .forEach(System.out::println);
    }

    public static void printOdd(List<Integer> numbers){
        numbers.stream()
                .filter(number -> (number&1)==1)
                .forEach(System.out::println);
    }
}
