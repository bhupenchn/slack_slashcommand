package com.darubramha.slack;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.darubramha.slack.SlackApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SlackApplication.class)
@WebAppConfiguration
public class SlackApplicationTests {

	@Test
	public void contextLoads() {
	}

}
