package com.cruzandre.mscompra.controller;

import com.cruzandre.mscompra.model.Pedido;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @PostMapping
    public ResponseEntity<Pedido> salvar(@RequestBody Pedido pedido){
        return ResponseEntity.ok(pedido);
    }
}
