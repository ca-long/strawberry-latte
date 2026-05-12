package com.example.backend;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class CafeDetailController {

    @GetMapping("/api/cafe/{cafeID}")
    public CafeDetailDTO getCafeDetail(@PathVariable int cafeID) {

        List<MenuDetailDTO> menus = List.of(
                new MenuDetailDTO("스타벅스 인하대점", "아메리카노", 4700, 5.0, 77, 123.456, 23.456),
                new MenuDetailDTO("스타벅스 인하대점", "딸기라떼", 6300, 4.8, 248, 123.456, 23.456)
        );

        return new CafeDetailDTO(
                cafeID,
                "스타벅스 인하대점",
                "공부하기 좋은 조용한 카페",
                4.8,
                700,
                menus,
                123.456,
                23.456
        );
    }
}
