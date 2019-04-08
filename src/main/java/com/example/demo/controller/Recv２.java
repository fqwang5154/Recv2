package com.example.demo.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RabbitListener(queues = "simple_queue")
public class Recv２ {

	@GetMapping("recv2")
	@ResponseBody
	@RabbitHandler
	public void recv(String msg) {
		System.out.println(msg);
	}
}
