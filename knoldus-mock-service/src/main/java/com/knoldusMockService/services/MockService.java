package com.knoldusMockService.services;

import com.knoldusMockService.model.StockDetails;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MockService {

    StockDetails getRelienceDetails();

    StockDetails getKnoldusDetails();
    StockDetails getTataDetails();
    StockDetails getAdityaDetails();

}
