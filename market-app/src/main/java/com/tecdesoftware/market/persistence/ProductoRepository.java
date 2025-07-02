package com.tecdesoftware.market.persistence;

import com.tecdesoftware.market.persistence.crud.ProductoCrudRepository;
import com.tecdesoftware.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {
   private ProductoCrudRepository productoCrudRepository;

   public List<Producto> getALL() {
       return (List<Producto>) productoCrudRepository.findAll();

    }
    public List<Producto> getByIdCategoria(int idCategoria){
       return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }
    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(cantidad,estado:true)
    }

    public Optional<Producto> getProducto(int idProducto){
       return productoCrudRepository.save(producto);
    }
    public void save (Producto producto){
       return productoCrudRepository.save(producto);
    }
    public void delete (Producto producto){
       return productoCrudRepository.delete(producto);
    }
}
