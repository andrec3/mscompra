package com.cruzandre.mscompra.service;

import com.cruzandre.mscompra.model.Pedido;
import com.cruzandre.mscompra.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    public Pedido salvar(Pedido pedido){
        return pedidoRepository.save(pedido);
    }
}
