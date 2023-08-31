package com.example.paginasupermercado.persistence.Mapper;

import com.example.paginasupermercado.domain.category;
import com.example.paginasupermercado.persistence.entity.categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idcategoria", target = "categoryid"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active")

    })
    category toCategory(categoria categoria);
    @InheritInverseConfiguration
    @Mapping(target="productos", ignore = true)
        categoria tocategoria (category Category);


}
