package com.bn.products.repositories;

import com.bn.products.models.ClienteModel;
import com.bn.products.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
}
