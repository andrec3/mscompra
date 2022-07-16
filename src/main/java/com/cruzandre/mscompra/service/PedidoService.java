package com.cruzandre.mscompra.service;

import com.cruzandre.mscompra.model.Pedido;
import com.cruzandre.mscompra.repository.PedidoRepository;
import com.cruzandre.mscompra.service.rabbitmq.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private Producer producer;

    public Pedido salvar(Pedido pedido){
        pedido = pedidoRepository.save(pedido);
        producer.enviarPedido(pedido.toString());
        return pedido;
    }
}
