package com.pedrodemorais.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping
    public String criarPedido() {

        String pedidoId = UUID.randomUUID().toString();

        System.out.println("Pedido recebido: " + pedidoId);

        restTemplate.getForObject(
                "http://localhost:8082/payment/" + pedidoId,
                String.class
        );

        restTemplate.getForObject(
                "http://localhost:8083/inventory/" + pedidoId,
                String.class
        );

        System.out.println("Pedido finalizado: " + pedidoId);

        return "Pedido criado!";
    }
}