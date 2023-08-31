package com.example.paginasupermercado.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
public class comprasproductoPK implements Serializable {

    @Column (name = "id_compra")
    private Integer idcompra;

    @Column (name = " id_producto")
    private Integer idpruducto;

    public Integer getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(Integer idcompra) {
        this.idcompra = idcompra;
    }

    public Integer getIdpruducto() {
        return idpruducto;
    }

    public void setIdpruducto(Integer idpruducto) {
        this.idpruducto = idpruducto;
    }
}
