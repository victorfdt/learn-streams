package com.victor.streams;

import com.victor.streams.collecting.CollectingOperation;
import com.victor.streams.interfaces.Exercise;

public class TestLearnStreams {
	public static void main(String args[]) throws Exception {

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
		//Exercise exercise = new ReductionOperations();
		
		// Parallel operation
		//Exercise exercise = new ParallelOperation();
		
		// Custom Parallel operation
		//Exercise exercise = new CustomParallelOperation();
		
		// Mapping operation
		//Exercise exercise = new MappingOperation();
		
		// Mapping objects
		//Exercise exercise = new MappingObjects();
		
		// Collecting operation
		Exercise exercise = new CollectingOperation();

		exercise.run();
	}
}
