package com.example.paginasupermercado.persistence.Mapper;

import com.example.paginasupermercado.domain.product;
import com.example.paginasupermercado.persistence.entity.producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper (componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {
    @Mappings(value = {
            @Mapping(source = "idproducto", target = "productid"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "idcategoria", target = "categoryId"),
            @Mapping(source = "precioventa", target = "price"),
            @Mapping(source = "cantidadstock", target = "stock"),
            @Mapping(source = "estado", target = "active"),

    }
    )
    product toproduct(producto Producto);

    List<product> toProducts(List<producto> productos);

    @InheritInverseConfiguration
    @Mapping(target = "codigodebarras", ignore = true)
    producto toProducto(product Product);
}
