import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianTwoSortedArraysTest {

    private final MedianTwoSortedArrays testSubject = new MedianTwoSortedArrays();

    @Test
    void test1() {
        //given
        int[] input1 = {1, 3};
        int[] input2 = {2};

        //when
        double actual = testSubject.findMedianSortedArrays(input1, input2);

        //then
        assertEquals(2.0, actual);
    }

    @Test
    void test2() {
        //given
        int[] input1 = {1, 2};
        int[] input2 = {3, 4};

        //when
        double actual = testSubject.findMedianSortedArrays(input1, input2);

        //then
        assertEquals(2.5, actual);
    }
}