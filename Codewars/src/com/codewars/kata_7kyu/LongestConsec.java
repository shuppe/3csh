package com.codewars.kata_7kyu;

import java.util.Arrays;
import java.util.Comparator;


public class LongestConsec {
	   public static String longestConsec(String[] strarr, int k) {
	        String longest = "";
	        if ( k>0 && strarr.length>0) {
	          Arrays.sort(strarr, Comparator.comparingInt(String::length));
	          for(int i=0; i<k; i++) {
	            longest=longest+strarr[i];
	          }
	        }
	        return longest;
	    }
	   
}
