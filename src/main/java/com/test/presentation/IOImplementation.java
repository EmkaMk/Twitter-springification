package com.test.presentation;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.test.entities.Tweet;

public class IOImplementation implements IOHandler {

	private Scanner in = new Scanner(System.in);

	public IOImplementation() {
		super();
	}

	@Override
	public String readFromConsoleInput() {
		String option = in.nextLine();

		return option;
	}

	@Override
	public void writeToConsoleOutput(List<Tweet> tweets) {
		// TODO Auto-generated method stub
		Collections.reverse(tweets);
		for(Tweet t: tweets)
		{
			System.out.println(t.getContent());
		}

	}

}
