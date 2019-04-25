package com.egbert.rabbitmq.producer;

import com.egbert.rabbitmq.producer.producer.IMessageProducerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@SpringBootTest(classes=StartSpringBootMain.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestRabbitMQ {

	@Resource
	private IMessageProducerService messageProducerService;
	
	@Test
	public void testSend() throws Exception {
		for (int i = 0; i < 100; i++) {
			this.messageProducerService.sendMessage("myproject : " + i);
		}
	}
	
}
