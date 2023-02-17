package _03_More_Algorithms;

import java.util.Iterator;
import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return null;
    }
    
    //1
    public static int findBrokenEgg(List<String> eggs) {
    	for(int i = 0; i < eggs.size(); i++) {
    		if(eggs.get(i).contains("cracked")) {
    			return i;
    		}
    	}
    	
        return -1;
    }
    
    
    //2
    public static int countPearls(List<Boolean> oysters) {
    	for(int i = 0; i < oysters.size(); i++) {
    		if(oysters.get(i).booleanValue() == true) {
    			return i;
    		}
    	}
    	return -1;
    }
    
    //3
    public static Double findTallest(List<Double> ppl) {
    	Double tallest = 0.0;
    	for(int i = 0; i < ppl.size(); i++) {
    		if(ppl.get(i) > tallest) {
    			tallest = ppl.get(i);
    		}
    	}
    	return tallest;
    }
    
    //4 
    public static String findLongestWord(List<String> words) {
    	String longestWord = "";
    	for(int i = 0; i < words.size(); i++) {
    		if(words.get(i).length() > longestWord.length()) {
    			longestWord = words.get(i);
    		}
    	}
    	return longestWord;
    }
    
    //4
    public static Boolean containsSOS(List<String> list) {
  
    	for(int i = 0; i < list.size(); i++) {
    		if(list.get(i).contains("... --- ...")) {
    			return true;
    		}
    	}
    	
    	return false;
    }
    
    public static List<Double> sortScores(List<Double> scores) {

    	
    	for(int i = 0; i < scores.size(); i++) {
    		for(int j = 0; j < scores.size()-1; j++) {
    			if(scores.get(j) > scores.get(j+1)) {
    				double temp = scores.get(j);
    				scores.set(j, scores.get(j+1));
    				scores.set(j+1, temp);
    			}
    		}
    	}
    	
    	return scores;
    }
    
    //5
    public static List<String> sortDNA(List<String> dna){
    	for(int j = 0; j<dna.size();j++) {
    		for(int i = 0; i < dna.size()-1; i++) {
    			if(dna.get(i).length() > dna.get(i+1).length()) {
	    			String temp = dna.get(i);
	    			dna.set(i, dna.get(i+1));
	    			dna.set(i+1, temp);
    			}
    		}
    	}
    	return dna;
    }
    
    public static List<String> sortWords(List<String> words) {
    	for (int i = 0; i < words.size(); i++) {
    		for(int j = i+1; j < words.size(); j++) {
				if(words.get(i).compareTo(words.get(j))>0){
					String temp = words.get(j);
					words.set(j, words.get(i));
					words.set(i, temp);
				}
    		}
		}
    	
    	return words;
    }
}
