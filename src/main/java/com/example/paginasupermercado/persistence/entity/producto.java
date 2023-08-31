package com.example.paginasupermercado.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "productos")
public class  producto {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column (name = " id_producto")
    private Integer idproducto;

    private String nombre;

    @Column ( name = " id_categoria")
    private Integer idcategoria;

    @Column (name = "codigo_barras")
    private String codigodebarras;

    @Column (name = "precio_venta")
    private Double precioventa;

    @Column (name = "cantidad_stock")
    private Integer cantidadstock;

    private Boolean estado;

    @ManyToOne
    @JoinColumn ( name = " id_categoria", insertable = false, updatable = false )
    private categoria Categoria;
    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Integer idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getCodigodebarras() {
        return codigodebarras;
    }

    public void setCodigodebarras(String codigodebarras) {
        this.codigodebarras = codigodebarras;
    }

    public Double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(Double precioventa) {
        this.precioventa = precioventa;
    }

    public Integer getCantidadstock() {
        return cantidadstock;
    }

    public void setCantidadstock(Integer cantidadstock) {
        this.cantidadstock = cantidadstock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
