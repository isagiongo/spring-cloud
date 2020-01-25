package com.isagiongo.cloud.pricingservice.v1.controllers;

import com.isagiongo.cloud.pricingservice.v1.controllers.dtos.PriceRequest;
import com.isagiongo.cloud.pricingservice.v1.controllers.dtos.PriceResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/v1")
public class PriceController {

    @GetMapping("/prices")
    public ResponseEntity<PriceResponse> getPriceAmount(@RequestBody PriceRequest priceRequest) {
        return new ResponseEntity<PriceResponse>(new PriceResponse(BigDecimal.ZERO), HttpStatus.OK);
    }
}
