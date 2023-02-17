package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	
    public BogoSorter() {
        type = "Bogo";
    }

    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
    	boolean inOrder = false;
    	
    	while(!inOrder) {
    	
	        for(int i = 0; i < array.length; i++) {
	        	
	        	for(int k = 0; k < array.length - 1; k++) {
	        		
	        		if(array[k] > array[k+1]) {
	        			int randomIndex1 = new Random().nextInt(((array.length) - (k+1))) + (k+1);
	        			int randomIndex2 = new Random().nextInt(((array.length) - (k+1))) + (k+1);
        			
	        			int temp  = array[randomIndex1];
	        			array[randomIndex1] = array[randomIndex2];
	        			array[randomIndex2] = temp;
	        			System.out.println("Out of order");
	        			display.updateDisplay();
	        			continue;
	        		}else {
	        			System.out.println("In order");
	        			continue;
	        		}
	        		
	        	}
	        }
	        
    	}
        
    }
}
