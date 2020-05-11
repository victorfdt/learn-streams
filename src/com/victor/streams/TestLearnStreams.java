package com.victor.streams;

import com.victor.streams.interfaces.Exercise;
import com.victor.streams.reduction.ReductionOperations;

public class TestLearnStreams {
	public static void main(String args[]) {

		// LastNameExample: Sort a stream using MyCorpComparator
		// Exercise exercise = new LastNameExample();

		//
		// Exercise exercise = new LastNameThenFirstNameExample();

		// LearnStreams: Work with Streams and Comparators
		// Exercise exercise = new LearnStreams();

		// Question1: Question about re-using Streams.
		//Exercise exercise = new Question1();

		// Learn Comparable
		//Exercise exercise = new LearnComparable();
		
		// Learn reduction operations
		Exercise exercise = new ReductionOperations();

		exercise.run();
	}
}
