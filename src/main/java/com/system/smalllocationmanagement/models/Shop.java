package com.system.smalllocationmanagement.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "area_name")
    public String areaName;

    @Column(name = "shop_name")
    public String shopName;

    @Column(name = "area_id")
    public Long areaId;
}
