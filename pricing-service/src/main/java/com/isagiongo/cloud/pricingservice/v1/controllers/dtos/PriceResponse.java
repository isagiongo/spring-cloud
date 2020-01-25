package com.isagiongo.cloud.pricingservice.v1.controllers.dtos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class PriceResponse {

    private final BigDecimal price;

    @JsonCreator
    public PriceResponse(@JsonProperty(required = true) BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
