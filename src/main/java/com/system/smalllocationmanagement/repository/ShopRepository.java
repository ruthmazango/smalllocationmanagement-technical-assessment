package com.system.smalllocationmanagement.repository;
import com.system.smalllocationmanagement.models.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long>{
//    Optional<Shop> findById(Long areaId);
    List<Shop> findByAreaId(Long areaId);

}
