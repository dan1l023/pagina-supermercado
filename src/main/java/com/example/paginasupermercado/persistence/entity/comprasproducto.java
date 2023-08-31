package com.example.paginasupermercado.persistence.entity;


import jakarta.persistence.*;

@Entity
@Table( name = " compras_productos")
public class comprasproducto {

    @EmbeddedId
    private comprasproductoPK id ;

    private Integer cantidad;

    private Double total;

    private Boolean estado;

    @ManyToOne
    @JoinColumn (name = "id_comopra", insertable = false, updatable = false)
    private compra compra;
    @ManyToOne
    @JoinColumn (name = "id_producto", insertable = false, updatable = false)
    private producto producto;


    public comprasproductoPK getId() {
        return id;
    }

    public void setId(comprasproductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
