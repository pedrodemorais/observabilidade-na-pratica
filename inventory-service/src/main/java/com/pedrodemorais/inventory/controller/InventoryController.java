package com.pedrodemorais.inventory.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @GetMapping("/{pedidoId}")
    public String atualizar(@PathVariable String pedidoId) {
        System.out.println("Estoque atualizado: " + pedidoId);
        return "Estoque OK";
    }
}