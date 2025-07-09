package com.tecdesoftware.market.persistence.crud;
import com.tecdesoftware.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    //query method
    //Select *
    //FROM productos
    //Where id_categoria = 5
    //Order by nombre ASC
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    // Productos con stock menor que cantidad y estado activo
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

    // Nuevo método para traer productos junto con la categoría usando JOIN FETCH
    @Query("SELECT p FROM Producto p JOIN FETCH p.categoria")
    List<Producto> findAllWithCategoria();

    // Nota: el método idProducto no es necesario aquí, lo puedes eliminar si no lo usas
}