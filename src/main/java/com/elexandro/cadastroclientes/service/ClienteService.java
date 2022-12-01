package com.elexandro.cadastroclientes.service;

import com.elexandro.cadastroclientes.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void deletar(Long id);
}
