package com.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.TwitterDao;
import com.test.entities.Tweet;

@Service("service")

public class TwitterService {

	private TwitterDao dao;

	@Autowired
	public TwitterService(TwitterDao dao) {
		super();
		this.dao = dao;

	}

	public TwitterService() {
		super();
	}

	public void writeTweet(Tweet tweet) {
		// TODO Auto-generated method stub
		dao.save(tweet);

	}

	public List<Tweet> readTweets() {
		// TODO Auto-generated method stub
		return dao.read();
	}

}
