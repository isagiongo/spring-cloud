package com.isagiongo.cloud.pricingservice.v1.controllers;

import com.isagiongo.cloud.pricingservice.services.PriceCalculator;
import com.isagiongo.cloud.pricingservice.v1.controllers.dtos.PriceRequest;
import com.isagiongo.cloud.pricingservice.v1.controllers.dtos.PriceResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/v1")
public class PriceController {

    private final PriceCalculator priceCalculator;

    public PriceController(PriceCalculator priceCalculator) {
        this.priceCalculator = priceCalculator;
    }

    @PostMapping("/prices")
    public ResponseEntity<PriceResponse> getPriceAmount(@RequestBody PriceRequest priceRequest) {
        return new ResponseEntity<>(new PriceResponse(priceCalculator.calculatePrice(priceRequest.getStart(), priceRequest.getEnd(), priceRequest.getPlan())),
                HttpStatus.OK);
    }

}
