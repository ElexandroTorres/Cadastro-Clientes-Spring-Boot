package com.elexandro.cadastroclientes.repository;

import com.elexandro.cadastroclientes.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
