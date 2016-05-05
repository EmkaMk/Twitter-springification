package com.test.presentation;
import java.util.List;

import com.test.entities.Tweet;

public interface IOHandler {

	public String readFromConsoleInput();
	public void writeToConsoleOutput(List<Tweet> tweets);
	
}
