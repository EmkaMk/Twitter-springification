package com.test;

import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;

import com.test.presentation.TwitterController;

/**
 * 
 */

/**
 * @author Emilija
 *
 */
@SpringBootApplication
@ComponentScan
public class TwitterApplication implements CommandLineRunner, ApplicationContextAware {

	/**
	 * @param args
	 */
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(TwitterApplication.class, args);

	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		applicationContext.getBean(TwitterController.class).readUserInput();

	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext = arg0;

	}
}
