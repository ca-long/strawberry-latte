package com.example.backend;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class MenuSearchController {

    @GetMapping("/api/menu/search")
    public List<MenuDetailDTO> getCafesByMenu(@RequestParam String name) {
        List<MenuDetailDTO> list = new ArrayList<>();

        list.add(new MenuDetailDTO("스타벅스 인하대점", name, 4700, 5.0, 77, 123.456, 23.456));
        list.add(new MenuDetailDTO("공차 인천인하대점", name, 3500, 4.0, 30, 124.77, 23.4));
        list.add(new MenuDetailDTO("투썸플레이스 인천인하대후문점", name, 4100, 4.5, 64, 123.9, 23.2));

        return list;
    }
}