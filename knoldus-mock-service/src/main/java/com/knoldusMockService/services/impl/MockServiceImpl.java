package com.knoldusMockService.services.impl;

import com.knoldusMockService.model.StockDetails;
import com.knoldusMockService.services.MockService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MockServiceImpl implements MockService {
    /**
     *
     * @return Stock of Relience
     */
    @Override
    public StockDetails getRelienceDetails() {

        return new StockDetails(101,"Relience Digital", 999.0,5.0,2.0);
    }

    /**
     *
     * @return Stock of Knoldus
     */
    @Override
    public StockDetails getKnoldusDetails() {
        return new StockDetails(102,"Knoldus",1220.0,4.5,16.0);
    }

    /**
     *
     * @return Stock of Tata
     */
    @Override
    public StockDetails getTataDetails() {
        return new StockDetails(103,"Tata",1403.0,42.5,10.0);
    }

    /**
     *
     * @return  Stock of Aditya
     */
    @Override
    public StockDetails getAdityaDetails() {
        return new StockDetails(104,"Aditya",4520.0,44.5,11.0);
    }
}
