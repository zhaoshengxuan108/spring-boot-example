package com.egbert.rabbitmq.producer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProducerConfig {

	public static final String EXCHANGE = "egbert.myproject.exchange";
	public static final String ROUTINGKEY = "egbert.myproject.routingkey";
	public static final String QUEUE_NAME = "egbert.myproject.queue";
	
	@Bean
	public Binding bindingExchangeQueue(DirectExchange exchange, Queue queue) {
		return BindingBuilder.bind(queue).to(exchange).with(ROUTINGKEY);
	}
	
	@Bean
	public DirectExchange getDirectExchange() {
		return new DirectExchange(EXCHANGE, true, true);
	}
	
	@Bean
	public Queue queue() {
		return new Queue(QUEUE_NAME);
	}
	
}
