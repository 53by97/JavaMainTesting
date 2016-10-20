package com.kvvssut.learnings.java.collections.colelctioninterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MergeCollections {

	/*
	 * Merges two collections into one, provided that the iterators of each
	 * return their elements ascending in natural order.
	 */

	static <T extends Comparable<? super T>> List<T> merge(
			Collection<? extends T> c1, Collection<? extends T> c2) {
		List<T> mergedList = new ArrayList<T>();
		Iterator<? extends T> itr1 = c1.iterator();
		Iterator<? extends T> itr2 = c2.iterator();

		T c1Element = getNextElement(itr1);
		T c2Element = getNextElement(itr2);

		while (c1Element != null || c2Element != null) {
			boolean useC1Element = c2Element == null || c1Element != null
					&& c1Element.compareTo(c2Element) < 0;

			if (useC1Element) {
				mergedList.add(c1Element);
				c1Element = getNextElement(itr1);
			} else {
				mergedList.add(c2Element);
				c2Element = getNextElement(itr2);
			}
		}

		return mergedList;
	}

	static <E> E getNextElement(Iterator<E> itr) {
		if (itr.hasNext()) {
			E nextElement = itr.next();
			if (nextElement == null) {
				throw new NullPointerException();
			}
			return nextElement;
		} else {
			return null;
		}
	}

}
