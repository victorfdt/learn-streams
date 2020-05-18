package com.victor.streams.iterator;

import java.util.PrimitiveIterator.OfInt;
import java.util.SplittableRandom;
import java.util.stream.IntStream;

import com.victor.streams.interfaces.Exercise;

public class UsingIterator implements Exercise {

	@Override
	public void run() throws Exception {
		// data sourceI
		// https://explainjava.com/random-number-generator-java/
		System.out.println("Generating a Stream of int using SplittableRandom");
		IntStream myStream = IntStream.generate(() -> new SplittableRandom().nextInt(1, 99)).limit(20);

		OfInt myIterator = myStream.iterator();

		System.out.println("Displaying the generated Stream using iterator");
		while (myIterator.hasNext()) {
			System.out.print(myIterator.next() + " ");
		}

	}

}
