package com.example.paginasupermercado.persistence.crud;

import com.example.paginasupermercado.persistence.entity.producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface productocrudrepository extends CrudRepository <producto, Integer> {
    @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    List<producto> findByIdcategoriaOrderByNombreAsc(int idcategoria);
    Optional<List<producto>> findBycantidadstockLessThanAndestado(int cantidadstock, boolean estado);

    Optional<List<producto>> findByprecioventaGreaterThancantidadstock(double precioventa, boolean cantidadstock);

}
