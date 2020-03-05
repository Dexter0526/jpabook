package jpabook.model.entity;

import javax.persistence.*;

@Entity
public class Delivery {
    @Id @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;

    @OneToOne(mappedBy = "DELIVERY_ID")
    private Order order;
    private String city;
    private String street;
    private String zipcode;
    @Enumerated(EnumType.STRING)
    private  DeliveryStatus status;

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Order getOrder() {
        return order;
    }

    public Long getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public DeliveryStatus getStatus() {
        return status;
    }

}
