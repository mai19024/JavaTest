package edu.princeton.cs.algs4;

/**  Compilation:  javac Test.java
*  Execution:    java edu.princeton.cs.algs4.Test < in500.txt > out500.txt
*  Dependencies: Insertion.java Quick.java 1 2 3 SortCompare.java Stdin Stdout StdRandom Stopwatch*/

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] a1 = StdIn.readAllInts();
	        Integer[] a = new Integer[a1.length];
	        
	        int i = 0;
	        for(int value : a1) {
	        	a[i++] = Integer.valueOf(value);
	        }
	        
	        Integer[] a2 = a ;
	        Integer[] a3 = a ;
	        Integer[] a4 = a ;
	        Integer[] a5 = a ;
	        
	        String alg1 = "Quick1";
	        String alg2 = "Quick2";
	        String alg3 = "Quick3";
	        String alg4 = "Insertion";
	        String alg5 = "Quick";
	        
	        SortCompare mySC = new SortCompare();
	        
	        StdOut.println("Testing Algorithms for an array size: " + a1.length);
	        StdOut.println(alg1 + " finished in: " +mySC.timeRandomInput(alg1, 1, a) + " sec.");
	        StdOut.println(alg2 + " finished in: " +mySC.timeRandomInput(alg2, 1, a2) + " sec.");
	        StdOut.println(alg3 + " finished in: " +mySC.timeRandomInput(alg3, 1, a3) + " sec.");
	        StdOut.println(alg4 + " finished in: " +mySC.timeRandomInput(alg4, 1, a4) + " sec.");
	        StdOut.println(alg5 + " finished in: " +mySC.timeRandomInput(alg5, 1, a5) + " sec.");

	}

}
