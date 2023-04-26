package org.sample;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		System.out.println("Hello java");
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);

		System.out.println(li.size());
		System.out.println(li.get(1));

	}
}
