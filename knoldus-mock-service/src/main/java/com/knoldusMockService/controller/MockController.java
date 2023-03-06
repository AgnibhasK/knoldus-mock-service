package com.knoldusMockService.controller;

import com.knoldusMockService.model.StockDetails;
import com.knoldusMockService.services.MockService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/mock")
public class MockController {
    @Autowired
    MockService service;

    @ApiOperation(value = "This api will fetch Relience the details of the Stock.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successfully Fetched Relience Stock Details"),
            @ApiResponse(code = 403, message = "If data is not found.")
    })
    @GetMapping(value = "/relience/details", produces = MediaType.APPLICATION_JSON_VALUE)
    public StockDetails getRelienceDetails() {

        return service.getRelienceDetails();
    }

    @ApiOperation(value = "This api will fetch Tata the details of the Stock.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successfully Fetched Tata Stock Details"),
            @ApiResponse(code = 403, message = "If data is not found.")
    })
    @GetMapping(value = "/tata/details", produces = MediaType.APPLICATION_JSON_VALUE)
    public StockDetails getTataDetails() {

        return service.getTataDetails();
    }

    @ApiOperation(value = "This api will fetch Knoldus the details of the Stock.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successfully Fetched Knoldus Stock Details"),
            @ApiResponse(code = 403, message = "If data is not found.")
    })
    @GetMapping(value = "/Knoldus/details", produces = MediaType.APPLICATION_JSON_VALUE)
    public StockDetails getKnoldusDetails() {

        return service.getKnoldusDetails();
    }

    @ApiOperation(value = "This api will fetch Aditya the details of the Stock.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successfully Fetched Aditya Stock Details"),
            @ApiResponse(code = 403, message = "If data is not found.")
    })
    @GetMapping(value = "/aditya/details", produces = MediaType.APPLICATION_JSON_VALUE)
    public StockDetails getAdityaDetails() {

        return service.getAdityaDetails();
    }
}
