package com.pedrodemorais.paymentservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping("/{pedidoId}")
    public String pagar(@PathVariable String pedidoId) {
        System.out.println("Pagamento processado: " + pedidoId);
        return "Pagamento OK";
    }
}