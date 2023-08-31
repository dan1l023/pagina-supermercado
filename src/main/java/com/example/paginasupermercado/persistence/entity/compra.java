package com.example.paginasupermercado.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table (name = "compras")
public class compra {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column(name   = "id_compra")
        private Integer idcompra;
    @Column (name = "id_cliente ")
        private String idcliente;

        private LocalDateTime fecha;
    @Column (name = "medio_pago")
        private String medioppago;

        private String comentario;
    @ManyToOne
    @JoinColumn (name = " id_cliente", insertable = false, updatable = false)
        private cliente cliente;

    @OneToMany (mappedBy = "producto")
    private List<comprasproducto> productos;
    public Integer getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(Integer idcompra) {
        this.idcompra = idcompra;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMedippago() {
        return medioppago;
    }

    public void setMedippago(String medippago) {
        this.medioppago = medippago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    private String estado ;



}
