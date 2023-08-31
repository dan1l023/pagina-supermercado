package com.example.paginasupermercado.persistence;
import com.example.paginasupermercado.domain.product;
import com.example.paginasupermercado.domain.repository.ProductRepository;
import com.example.paginasupermercado.persistence.Mapper.ProductMapper;
import com.example.paginasupermercado.persistence.crud.ProductoCrudrespository;
import com.example.paginasupermercado.persistence.entity.producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public class productorepository implements ProductRepository  {
    @Autowired
    private ProductoCrudrespository productocruderepository;
    @Autowired
    private ProductMapper mapper;
    @Override
    public List<product> getAll() {
        List<producto> productos =    (List<producto>) productocruderepository.findAll();
        return mapper.toProducts(productos) ;
    }

    @Override
    public Optional<List<product>> getByCategory(int categoryId) {
        List<producto> productos = productocruderepository.findByIdcategoriaOrderByNombreAsc(categoryId);

        return Optional.of(mapper.toProducts(productos));
    }

    @Override
    public Optional<List<product>> getScarseProducts(int quantity) {
        Optional<List<producto>>productos=productocruderepository.findBycantidadstockLessThanAndestado(quantity, true);
        return productos.map(prods -> mapper.toProducts(prods) );
    }

    @Override
    public Optional<product> getProduct(int productId) {

        return productocruderepository.findById(productId).map(producto -> mapper.toproduct(producto));
    }

    @Override
    public product save(product Product) {
    producto PRODUCTO = mapper.toProducto(Product);
        return mapper.toproduct(productocruderepository.save(PRODUCTO)) ;
    }
    public Optional<List<producto>> getpreciomayor(int precio) {

        return productocruderepository.findByprecioventaGreaterThancantidadstock(precio, true);
    }

    @Override
    public void  delete (int productId) {

        productocruderepository.deleteById(productId);
    }
}
