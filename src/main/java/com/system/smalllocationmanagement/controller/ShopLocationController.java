package com.system.smalllocationmanagement.controller;

import com.system.smalllocationmanagement.models.Area;
import com.system.smalllocationmanagement.models.Shop;
import com.system.smalllocationmanagement.services.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/shoplocation")
public class ShopLocationController {

    private final ShopService shopService;

    @Autowired
    public ShopLocationController(ShopService shopService) {
        this.shopService = shopService;
    }

    @PostMapping("/create-shop")
    public ResponseEntity<Shop> createShop(@RequestBody Shop shop, @RequestBody Area area) {
        shopService.createShopByArea(shop, area);
        return new ResponseEntity<>(shop, HttpStatus.CREATED);
    }

    @GetMapping("/area/{areaName}")
    public ResponseEntity<List<Shop>> findByArea(@PathVariable Long areaId){
        List<Shop> shops = shopService.findByAreaId(areaId);
        return ResponseEntity.ok(shops);
    }
}
