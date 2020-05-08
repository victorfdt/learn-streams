package com.victor.streams.comparators;

import java.util.Comparator;

public class MyReverseComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}
}
