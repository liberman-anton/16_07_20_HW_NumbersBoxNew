package tel_ran.numbers.implementation;

import java.util.ArrayList;
import java.util.Collection;

import tel_ran.numbers.interfaces.INumbersBox;

public class NumbersBoxArrayList extends NumbersBoxCollection {
public NumbersBoxArrayList(){
	numbers=new ArrayList<Integer>();
}

@Override
protected INumbersBox getInstanceBox() {
	return new NumbersBoxArrayList();
}

@Override
protected Collection<Integer> getInstanceCollection() {
	return new ArrayList<Integer>();
}



}
