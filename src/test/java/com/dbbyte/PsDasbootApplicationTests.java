package com.dbbyte;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dbbyte.controller.HomeController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PsDasbootApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testHomeController() {
		HomeController hc = new HomeController();
		String result = hc.home();
		
		assertEquals(result, "DasBoot, reporting for duty!");
	}

}

