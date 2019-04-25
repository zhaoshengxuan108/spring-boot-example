package com.egbert.rabbitmq.consumer.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumerService {

	
	@RabbitListener(queues="egbert.myproject.queue")
	public void receiveMessage(String text) {
		System.out.println("*** 接收消息 : " + text);
	}

}
