package com.system.smalllocationmanagement.services;

import com.system.smalllocationmanagement.models.Area;
import com.system.smalllocationmanagement.models.Shop;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ShopService {
    List<Shop> findByAreaId(Long areaId);
    void createShopByArea(Shop shop, Area area);
}
