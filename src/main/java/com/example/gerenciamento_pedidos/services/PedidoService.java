package com.example.gerenciamento_pedidos.services;

import com.example.gerenciamento_pedidos.models.PedidoModel;
import com.example.gerenciamento_pedidos.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public PedidoModel salvar(PedidoModel pedido) {
        return pedidoRepository.save(pedido);
    }

    public List<PedidoModel> listarTodos() {
        return pedidoRepository.findAll();
    }

    public PedidoModel buscarPorId(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public PedidoModel atualizar(Long id, PedidoModel pedidoAtualizado) {
        pedidoAtualizado.setId(id);
        return pedidoRepository.save(pedidoAtualizado);
    }

    public void deletar(Long id) {
        pedidoRepository.deleteById(id);
    }
}

