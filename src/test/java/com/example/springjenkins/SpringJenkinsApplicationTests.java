package com.example.springjenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
	
	public static Logger Logger=LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		Logger.info("Test case Executing......");
		assertEquals(true,true);
	}

}
