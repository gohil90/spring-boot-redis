package com.gohil90.learning.redis.enitity;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("customer")
public class Customer {

    public enum Segment {
        PB, PRB, STAFF, PSB
    }

    @Id
    private Long cif;
    private String customerId;
    private String name;
    private Segment segment;

    public Customer(Long cif, String customerId, String name, Segment segment) {
        this.cif = cif;
        this.customerId = customerId;
        this.name = name;
        this.segment = segment;
    }

    public Long getCif() {
        return cif;
    }

    public void setCif(Long cif) {
        this.cif = cif;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Segment getSegment() {
        return segment;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cif=" + cif +
                ", customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", segment=" + segment +
                '}';
    }
}
