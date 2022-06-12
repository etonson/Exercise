package com.appleyk.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Pair<T, K> {
	private T first;
	private K last;

	public Pair(T first, K last) {
		this.first = first;
		this.last = last;
	}

	public T getFirst() {
		return first;
	}

	public K getLast() {
		return last;
	}
}

public class InterfaceReflict {
	public static void main(String[] args) {
		try {

			List ll = new ArrayList<>();
			ll.add("12");
			Pair mm = new Pair<>("123", 123);
			List nl = new ArrayList<>();

			nl.add(mm);

		} catch (Exception e) {
		}
	}

}
