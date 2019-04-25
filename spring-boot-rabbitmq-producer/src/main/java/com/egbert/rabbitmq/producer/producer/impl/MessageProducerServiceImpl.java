package com.egbert.rabbitmq.producer.producer.impl;

import com.egbert.rabbitmq.producer.config.ProducerConfig;
import com.egbert.rabbitmq.producer.producer.IMessageProducerService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MessageProducerServiceImpl implements IMessageProducerService {

	@Resource
	private RabbitTemplate rabbitTemplate;
	
	@Override
	public void sendMessage(String msg) {
		this.rabbitTemplate.convertAndSend(ProducerConfig.EXCHANGE, ProducerConfig.ROUTINGKEY, msg);
	}

}
