package tel_ran.numbers.implementation;

import java.util.Collection;
import java.util.HashSet;

import tel_ran.numbers.interfaces.INumbersBox;

public class NumbersBoxHashSet extends NumbersBoxCollection {

	public NumbersBoxHashSet() {
		this.numbers = new HashSet<Integer>();
	}

	@Override
	protected INumbersBox getInstanceBox() {
		return new NumbersBoxHashSet();
	}

	@Override
	protected Collection<Integer> getInstanceCollection() {
		return new HashSet<Integer>();
	}

}
