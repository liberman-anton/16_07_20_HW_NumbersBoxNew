package tel_ran.numbers.implementation;

import java.util.Collection;
import java.util.LinkedList;

import tel_ran.numbers.interfaces.INumbersBox;

public class NumbersBoxLinkedList extends NumbersBoxCollection {
public NumbersBoxLinkedList(){
	numbers=new LinkedList<Integer>();
}

@Override
protected INumbersBox getInstanceBox() {
	return new NumbersBoxLinkedList();
}

@Override
protected Collection<Integer> getInstanceCollection() {
	return new LinkedList<Integer>();
}

}
