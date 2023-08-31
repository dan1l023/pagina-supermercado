package com.example.paginasupermercado.persistence.crud;

import com.example.paginasupermercado.persistence.entity.producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
public interface ProductoCrudrespository extends CrudRepository <producto, Integer> {

    List<producto> findByIdcategoriaOrderByNombreAsc(int idcategoria);
    Optional<List<producto>> findBycantidadstockLessThanAndestado(int cantidadstock, boolean estado);

    Optional<List<producto>> findByprecioventaGreaterThancantidadstock(double precioventa, boolean cantidadstock);

}
