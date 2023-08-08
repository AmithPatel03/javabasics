package com.globallogic.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	
	@KafkaListener(topics = "topic1", groupId = "group1")
	public void consumeMessage(String message) {
		System.out.println(message);
	}

}
