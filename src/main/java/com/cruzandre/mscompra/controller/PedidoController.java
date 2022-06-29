package com.cruzandre.mscompra.controller;

import com.cruzandre.mscompra.model.Pedido;
import com.cruzandre.mscompra.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<Pedido> salvar(@RequestBody @Valid Pedido pedido){
        return ResponseEntity.ok(pedidoService.salvar(pedido));
    }
}
