package com.example.test.persistence.embeddable;

import com.example.test.persistence.entity.Order;
import com.example.test.persistence.entity.Product;
import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class OrderDetailId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "codigo_pedido", nullable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "codigo_producto", nullable = false)
    private Product product;

    public OrderDetailId() {
    }

    public OrderDetailId(Order orderId, Product productId) {
        this.order = orderId;
        this.product = productId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}