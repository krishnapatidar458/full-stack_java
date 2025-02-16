import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
import java.util.stream.Stream;

class StreamAPI{
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(4);
        nums.add(1);
        nums.add(2);
        nums.add(7);

        // nums.forEach(n -> System.out.println(n));

        // for(int n : nums){
        //     System.out.println(n);
        // }

        // Stream<Integer> st =  nums.stream();
        // Stream<Integer> st2 = st.filter(n -> n%2==0);
        // Stream<Integer> st3 = st2.map(n -> n*2);
        // int result = st3.reduce(0, (c,e) -> c+e);

        // int result = nums.stream()
        //     .filter(n -> n%2==0)
        //     .map(n -> n*2)
        //     .reduce(0,(c,e) -> c+e);

        // System.out.println(result);

        // st3.forEach(n -> System.out.println(n));
        // st.forEach(n -> System.out.print(n));

        Stream<Integer> st = nums.parallelStream()
                .filter(n -> n%2==0);
                // .sorted();
            
        st.forEach(n -> System.out.println(n));

    }
}