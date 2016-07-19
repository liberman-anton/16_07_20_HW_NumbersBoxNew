package tel_ran.numbers.implementation;

import java.util.Collection;
import java.util.TreeSet;

import tel_ran.numbers.interfaces.INumbersBox;

public class NumbersBoxTreeSet extends NumbersBoxCollection {

	public NumbersBoxTreeSet() {
		this.numbers = new TreeSet<Integer>();
	}

	@Override
	protected INumbersBox getInstanceBox() {
		return new NumbersBoxTreeSet();
	}

	@Override
	protected Collection<Integer> getInstanceCollection() {
		return new TreeSet<Integer>();
	}

}
