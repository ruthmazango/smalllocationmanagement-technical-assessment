package com.system.smalllocationmanagement.services;

import com.system.smalllocationmanagement.models.Area;
import com.system.smalllocationmanagement.models.Shop;
import com.system.smalllocationmanagement.repository.AreaRepository;
import com.system.smalllocationmanagement.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService{

    @Autowired
    private ShopRepository shopRepository;

    @Autowired
    private AreaRepository areaRepository;

//    @Override
//    public List<Shop> getShopsByLocation(){
//
//        //
//    }
    @Override
    public void createShopByArea(Shop shop, Area area){

        area = areaRepository.findById(Long area.getAreaId());
        if (area == null) {
            throw new IllegalArgumentException("Area not found");
        }

        shop = new Shop();
        shop.setShopName(shop.shopName);
        shop.setAreaName(shop.areaName);

        shopRepository.save(shop);
    }

    @Override
    public List<Shop> findByAreaId(Long areaId){

        return shopRepository.findByAreaId(areaId);
    }

}
