package com.man.client.spring.config.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.man.spring.config.client.SpringConfigClientApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringConfigClientApplication.class)
@SpringBootTest
public class SpringConfigClientApplicationTests {

	@Test
	public void contextLoads() {
	}

}
