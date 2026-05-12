package com.example.backend;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MenuDetailDTO {
    private String cafeName;
    private String menuName;
    private int price;
    private double rating;
    private int reviewCount;
    private double x;
    private double y;
}