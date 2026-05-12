package com.example.backend;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CafeDetailDTO {
    private int cafeID;
    private String cafeName;
    private String description;
    private double rating;
    private int reviewCount;
    private List<MenuDetailDTO> menuList;
    private double x;
    private double y;
}