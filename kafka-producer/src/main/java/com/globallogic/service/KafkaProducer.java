package com.globallogic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	private String topicName = "topic1";
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	public String sendMessage(String message) {
		kafkaTemplate.send(topicName,message);
		return "message sent";
	}
}


