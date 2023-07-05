package com.system.smalllocationmanagement.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Area")
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "area_id")
    public Long areaId;

    @Column(name = "areaName")
    public String areaName;
}
