package corejava.overriding;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Wine {
	String name() {
		return "wine";
	}
}

class SparklingWine extends Wine {
	@Override
	String name() {
		return "sparkling wine";
	}
}

class Champagne extends SparklingWine {
	@Override
	String name() {
		return "champagne";
	}
}

public class Overriding {
	public static void main(String[] args) {
		List<Wine> wineList = new List<Wine>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Wine> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Wine wine) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Wine> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Wine> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Wine get(int index) {
                return null;
            }

            @Override
            public Wine set(int index, Wine element) {
                return null;
            }

            @Override
            public void add(int index, Wine element) {

            }

            @Override
            public Wine remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Wine> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Wine> listIterator(int index) {
                return null;
            }

            @Override
            public List<Wine> subList(int fromIndex, int toIndex) {
                return null;
            }
        };// List.of(new Wine(), new SparklingWine(), new Champagne());

		for (Wine wine : wineList)
			System.out.println(wine.name());
	}
}

//Excerpt From: Joshua Bloch. “Effective Java”. Apple Books.
