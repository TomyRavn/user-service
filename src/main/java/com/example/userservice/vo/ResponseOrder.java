package com.example.userservice.vo;

import lombok.Data;

import java.util.Date;

@Data
public class ResponseOrder {
    private String productId;
    private int qty;
    private int unitPrice;
    private int totalPrice;
    private Date createdAt;

    private String orderId;
}
