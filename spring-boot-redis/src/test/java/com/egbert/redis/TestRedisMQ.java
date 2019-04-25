package com.egbert.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@SpringBootTest(classes=StartSpringBootMain.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestRedisMQ {

	@Resource
	private RedisTemplate <String, String> redisTemplate;
	
	@Test
	public void testRedis() throws Exception {
		redisTemplate.opsForValue().set("my", "java");
		System.out.println(redisTemplate.opsForValue().get("my"));
	}
	
}
