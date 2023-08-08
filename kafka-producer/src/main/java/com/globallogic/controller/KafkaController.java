package com.globallogic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.service.KafkaProducer;

@RestController
@RequestMapping("kafka")
public class KafkaController {
	
	@Autowired
	private KafkaProducer kafkaProducer;
	
	@GetMapping("/publish/{message}")
	public ResponseEntity<String> publishMessage(@PathVariable("message") String message){
		return new ResponseEntity<>(kafkaProducer.sendMessage(message),HttpStatus.OK);
	}

}
