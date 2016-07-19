package tel_ran.numbers.tests;

import tel_ran.numbers.implementation.NumbersBoxArrayList;
import tel_ran.numbers.implementation.NumbersBoxHashSet;
import tel_ran.numbers.implementation.NumbersBoxLinkedHashSet;
import tel_ran.numbers.implementation.NumbersBoxLinkedList;
import tel_ran.numbers.implementation.NumbersBoxTreeSet;
import tel_ran.numbers.interfaces.INumbersBox;

public class NumbersBoxPerformanceTestAppl {

	private static final int LENGTH_COLLECTION = 100000;
	private static final int N_RUNS = 1;
	static NumbersBoxPerformance performanceTest = 
			new NumbersBoxPerformance(LENGTH_COLLECTION, N_RUNS);
	
	public static void main(String[] args) {
		System.out.println("Performance test with length of collection = " + LENGTH_COLLECTION +
				" amount of runs " + N_RUNS + "\n");
		runTest(new NumbersBoxArrayList(), "NumbersBoxArrayList");
		runTest(new NumbersBoxHashSet(), "NumbersBoxHashSet");
		runTest(new NumbersBoxLinkedHashSet(), "NumbersBoxLinkedHashSet");
		runTest(new NumbersBoxLinkedList(), "NumbersBoxLinkedList");
		runTest(new NumbersBoxTreeSet(), "NumbersBoxTreeSet");
	}

	private static void runTest(INumbersBox numbersBox, String className) {
		performanceTest.setNumbersBox(numbersBox);
		System.out.println(className + " running time for method AddNumber: " + performanceTest.runAddNumber());
		System.out.println(className + " running time for method RemoveAllNumbers: " + performanceTest.runRemoveAllNumbers(t->t%2==0));
		System.out.println("---------------------------------");

	}

	

}
