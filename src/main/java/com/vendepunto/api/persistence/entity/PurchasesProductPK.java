package com.vendepunto.api.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PurchasesProductPK implements Serializable {
    @Column(name = "id_compra")
    private int idCompra;

    @Column(name = "id_producto")
    private int idProducto;
}
