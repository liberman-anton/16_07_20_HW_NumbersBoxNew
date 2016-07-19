package tel_ran.numbers.tests;

import java.util.function.Predicate;

import tel_ran.numbers.interfaces.INumbersBox;

public class NumbersBoxPerformance {

	private int lengthCollection;
	private int nRuns;
	private INumbersBox numbersBox;

	public NumbersBoxPerformance(int lengthCollection, int nRuns) {
		this.lengthCollection = lengthCollection;
		this.nRuns = nRuns;
	}

	public void setNumbersBox(INumbersBox numbersBox) {
		this.numbersBox = numbersBox;		
	}

	public long runAddNumber() {
		long timeStart=System.currentTimeMillis();
		for(int i = 0; i < lengthCollection; i++){
			numbersBox.addNumber(i);
		}
		return System.currentTimeMillis()-timeStart;
	}

	public long runRemoveAllNumbers(Predicate<Integer> predicate) {
		long timeStart=System.currentTimeMillis();
		numbersBox.removeAllNumbers(predicate);
		return System.currentTimeMillis()-timeStart;
	}

}
