package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	//1. use the assertEquals method to test your linear search method.
    			String[] test0 = {"Taco", "Nacho", "Toquito"};
    			assertEquals(0, _01_LinearSearch.linearSearch(test0, "Taco"));
    			assertEquals(1, _01_LinearSearch.linearSearch(test0, "Nacho"));
    			assertEquals(2, _01_LinearSearch.linearSearch(test0, "Toquito"));
    			
    			String[] test1 = {"Once", "upon", "a", "time", "in", "the", "East"};
    			assertEquals(6, _01_LinearSearch.linearSearch(test1, "East"));
    			
    			String[] test2 = {"Taco", "Nacho", "Toquito"};
    			assertEquals(-1, _01_LinearSearch.linearSearch(test2, "Loco"));	
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[] arr0 = {0, 1, 2, 3, 4, 5};
		assertEquals(0, _02_BinarySearch.binarySearch(arr0, 0, arr0.length - 1, 0));
		assertEquals(1, _02_BinarySearch.binarySearch(arr0, 0, arr0.length - 1, 1));
		assertEquals(2, _02_BinarySearch.binarySearch(arr0, 0, arr0.length - 1, 2));
		assertEquals(3, _02_BinarySearch.binarySearch(arr0, 0, arr0.length - 1, 3));
		
		assertEquals(-1, _02_BinarySearch.binarySearch(arr0, 0, arr0.length - 1, 99));
		
		int[] arr1 = {0, 43, 209, 388, 401, 599};
		assertEquals(2, _02_BinarySearch.binarySearch(arr1, 0, arr0.length - 1, 209));
		assertEquals(-1, _02_BinarySearch.binarySearch(arr1, 0, arr0.length - 1, 45));
    }
}
