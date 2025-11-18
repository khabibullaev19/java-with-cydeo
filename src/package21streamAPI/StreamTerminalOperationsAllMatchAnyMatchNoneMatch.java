package package21streamAPI;

import java.util.Arrays;

public class StreamTerminalOperationsAllMatchAnyMatchNoneMatch {

    // allMatch(Predicate) = checks if all elements in the stream matches with the specified predicate
    // anyMatch(Predicate) = checks if any elements in the stream matches with the specified predicate
    // noneMatch(Predicate) = checks if all the elements in the stream does not match with specified predicate

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,4,5,6,7,8,9};
        boolean r1 = Arrays.stream(nums1).allMatch(p -> p > 10);
        System.out.println(r1);

        int[] nums2 = {1,2,3,4,5,6,7,8,9};
        boolean r2 = Arrays.stream(nums1).anyMatch(p -> p % 2 != 0);
        System.out.println(r2);

        int[] nums3 = {1,2,3,4,5,6,7,8,9};
        boolean r3 = Arrays.stream(nums1).noneMatch(p -> p > 10);
        System.out.println(r3);

    }

}
