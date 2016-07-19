package tel_ran.numbers.implementation;

import java.util.Collection;
import java.util.LinkedHashSet;

import tel_ran.numbers.interfaces.INumbersBox;

public class NumbersBoxLinkedHashSet extends NumbersBoxCollection {

	public NumbersBoxLinkedHashSet() {
		this.numbers = new LinkedHashSet<Integer>();
	}

	@Override
	protected INumbersBox getInstanceBox() {
		return new NumbersBoxLinkedHashSet();
	}

	@Override
	protected Collection<Integer> getInstanceCollection() {
		return new LinkedHashSet<Integer>();
	}

}
