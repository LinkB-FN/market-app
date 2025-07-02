package com.tecdesoftware.market.persistence.crud;

import com.tecdesoftware.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
}
