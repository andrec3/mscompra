package com.cruzandre.mscompra.service.rabbitmq;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("/producer")
@RestController
public class Producer {

    @Autowired
    private final RabbitTemplate rabbitTemplate;
    private final Queue queue;

    @PostMapping
    public void producer(@RequestBody String payload){
        rabbitTemplate.convertAndSend(queue.getName(), payload);
    }
}
