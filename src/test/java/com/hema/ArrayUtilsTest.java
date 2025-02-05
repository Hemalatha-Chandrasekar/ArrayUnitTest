//package com.hema;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class ArrayUtilsTest {
//
//    @Test
//    void sortArray() {
//    }
//}

package com.hema;
import com.hema.ArrayUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayUtilsTest {

    @Test
    public void testSortArray() {
        ArrayUtils arrayUtils = new ArrayUtils();  // Create an instance of your ArrayUtils class
        int[] unsortedArray = {5, 3, 8, 1};
        int[] sortedArray = {1, 3, 5, 8};

        assertArrayEquals(sortedArray, arrayUtils.sortArray(unsortedArray), "The array should be sorted in ascending order");
    }
}