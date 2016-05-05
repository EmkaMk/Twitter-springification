package com.test.presentation;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.entities.Tweet;
import com.test.services.TwitterService;

@Component
public class TwitterController {


	TwitterService service;

	@Autowired
	public TwitterController(TwitterService service) {
		super();
		this.service = service;
	}

	public void menu() {

		System.out.println("------------");
		System.out.println("Choose one of the following options:");
		System.out.println("1:Read tweets");
		System.out.println("2:Write tweet");
		System.out.println("3:Terminate the application!");
		System.out.println("------------");
	}

	public void readUserInput() {
		 Scanner in = new Scanner(System.in);

		while (true) {
			String input = this.readFromConsoleInput();
			if (input.equals("3")) {
				System.out.println("Thank you for using our service! Come back soon");
				break;
			} else if (input.equals("1")) {
				this.writeToConsoleOutput(service.readTweets());

			} else if (input.equals("2")) {
				String tweet = this.readFromConsoleInput();
				Tweet t = new Tweet();
				t.setContent(tweet);
				service.writeTweet(t);
			}
		}
	}
	public String readFromConsoleInput() {
	 Scanner in = new Scanner(System.in);
		String option = in.nextLine();

		return option;
	}
	
	public void writeToConsoleOutput(List<Tweet> tweets) {
		// TODO Auto-generated method stub
		Collections.reverse(tweets);
		for(Tweet t: tweets)
		{
			System.out.println(t.getContent());
		}

	}

}