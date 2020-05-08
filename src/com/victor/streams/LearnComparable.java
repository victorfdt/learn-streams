package com.victor.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.victor.streams.comparables.Player;
import com.victor.streams.interfaces.Exercise;

public class LearnComparable implements Exercise {

	@Override
	public void run() {
		List<Player> myList = new ArrayList<>(
				List.of(new Player("Victor", 3), new Player("Leonardo", 1), new Player("Lucas", 2)));
		
		// I can use the sort method, because the Player class implements Comparable.
		Collections.sort(myList);
		
		myList.forEach(e -> System.out.println(e));

	}
}
