package com.test.dao;
import java.util.List;

import com.test.entities.Tweet;

public interface TwitterDao {

	public List<Tweet> read();

	public void save(Tweet tweet);
}
