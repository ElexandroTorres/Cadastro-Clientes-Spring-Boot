package com.elexandro.cadastroclientes.repository;

import com.elexandro.cadastroclientes.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
