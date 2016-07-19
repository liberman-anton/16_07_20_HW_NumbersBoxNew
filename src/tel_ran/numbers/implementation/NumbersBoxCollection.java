package tel_ran.numbers.implementation;

import java.util.*;
import java.util.function.Predicate;

import tel_ran.numbers.interfaces.INumbersBox;

public abstract class NumbersBoxCollection implements INumbersBox {
protected Collection<Integer> numbers;
	@Override
	public Iterator<Integer> iterator() {
		
		return numbers.iterator();
	}

	@Override
	public void addNumber(int number) {
		numbers.add(number);

	}

	@Override
	public void removeNumber(int number) {
		numbers.remove((Integer)number);

	}

	@Override
	public INumbersBox findNumbers(Predicate<Integer> predicate) {
		INumbersBox res=getInstanceBox();
		for(Integer number:numbers)
			if(predicate.test(number))
				res.addNumber(number);
		return res;
	}

	protected abstract INumbersBox getInstanceBox() ;

	@Override
	public void removeAllNumbers(int number) {
		Iterator<Integer> it=numbers.iterator();
		while(it.hasNext()){
			int num=it.next();
			if (num==number)
				it.remove();
		}

	}

	@Override
	public void removeAllNumbers(Predicate<Integer> predicate) {
		Iterator<Integer> it=numbers.iterator();
		while(it.hasNext()){
			if(predicate.test(it.next()))
				it.remove();
		}

	}

	@Override
	public void union(INumbersBox numbers) {
		for(Integer number:numbers){
			if(!this.numbers.contains(number))
				this.numbers.add(number);
		}

	}

	@Override
	public void intersection(INumbersBox numbers) {
		Collection<Integer> collection=getCollection(numbers);
		this.numbers.retainAll(collection);
	}

	private Collection<Integer> getCollection(INumbersBox numbers) {
		Collection<Integer> res = getInstanceCollection();
		for(Integer number: numbers)
			res.add(number);	
		return res;
	}

	protected abstract Collection<Integer> getInstanceCollection();

	@Override
	public void subtract(INumbersBox numbers) {
		removeRepeated();
		Collection<Integer> collection=getCollection(numbers);
		this.numbers.removeAll(collection);

	}

	@Override
	public void removeRepeated() {
		LinkedHashSet<Integer> tmp=new LinkedHashSet<Integer>(this.numbers);
		this.numbers.clear();
		this.numbers.addAll(tmp);
	}
	@Override
	public INumbersBox getNumbersInRange(int min, int max) {
		INumbersBox res = findNumbers(t->(t>=min&&t<=max));
		return res;
	}

}
