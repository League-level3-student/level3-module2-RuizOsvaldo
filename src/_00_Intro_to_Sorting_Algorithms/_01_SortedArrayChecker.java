package _00_Intro_to_Sorting_Algorithms;

public class _01_SortedArrayChecker {
    /*
     * Write a static method called intArraySorted.
     *
     * This method takes in an array of integers and it returns a boolean.
     * The method returns true if the integer array is in ascending order
     * and false otherwise.
     */
    public static boolean intArraySorted(int[] arr) {
    	
    	// This for loop puts every value in the correct position
        for (int i = 0; i < arr.length; i++) {
            
            // This for loop puts one value in the correct position
            for (int k = 0; k < arr.length - 1; k++) {
                
                // If the current element is bigger than the next, return false
            	// because ascending order should not execute this to be true
                if( arr[k] > arr[ k+1 ] ) {
                
                   return false;
                }
            }
        }
        
        //Printing out the true ascending array
        for( int i : arr ) {
            System.out.print(i + " ");
        }
        System.out.println();
        return true;
    }

    /*
     * 2. Write a static method called doubleArraySorted.
     *
     * This method takes in an array of doubles and it returns a boolean.
     * The method returns true if the double array is in ascending order
     * and false otherwise.
     */
    
    public static boolean doubleArraySorted(double[] arr) {
    	
    	// This for loop puts every value in the correct position
        for (int i = 0; i < arr.length; i++) {
            
            // This for loop puts one value in the correct position
            for (int k = 0; k < arr.length - 1; k++) {
                
                // If the current element is bigger than the next, return false
            	// because ascending order should not execute this to be true
                if( arr[k] > arr[ k+1 ] ) {
                
                   return false;
                }
            }
        }
        
        //Printing out the true ascending array
        for( double i : arr ) {
            System.out.print(i + " ");
        }
        System.out.println();
        return true;
    }

    /*
     * 3. Write a static method called charArraySorted.
     * 
     * This method takes in an array of characters and it returns a boolean.
     * The method returns true if the character array is in alphabetical
     * order and false otherwise (You can compare characters just like
     * integers).
     */
    public static boolean charArraySorted(char[] arr) {

        
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length - 1; k++) {
                
                // "a".compareTo( "b" ) => -1
                // "b".compareTo( "a" ) => 1
                // "b".compareTo( "b" ) => 0
                if( arr[k] > arr[ k+1 ] ) {
                    return false;
                }
            }
        }
        
        for( char i : arr ) {
            System.out.print(i + " ");
        }
        System.out.println();
        return true;
    }

    /*
     * 4. Write a static method called stringArraySorted.
     *
     *  This method takes in an array of Strings and it returns a boolean.
     *  The method returns true if the String array is in alphabetical
     *  order and false otherwise (Use the compareTo(String) method).
     */
    
public static boolean stringArraySorted(String[] arr) {

        
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length - 1; k++) {
                
                // "a".compareTo( "b" ) => -1
                // "b".compareTo( "a" ) => 1
                // "b".compareTo( "b" ) => 0
            	if( arr[k].compareTo(arr[ k+1 ]) > 0 ) {
                    return false;
                }
            }
        }
        
        for( String i : arr ) {
            System.out.print(i + " ");
        }
        System.out.println();
        return true;
    }

}
