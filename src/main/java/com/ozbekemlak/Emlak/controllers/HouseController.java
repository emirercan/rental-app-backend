package com.ozbekemlak.Emlak.controllers;

import com.ozbekemlak.Emlak.entities.House;
import com.ozbekemlak.Emlak.services.HouseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/house")
public class HouseController {

    private final HouseService houseService;

    public HouseController(HouseService houseService){
        this.houseService = houseService;
    }

    @GetMapping("/{houseId}")
    public ResponseEntity<House> getHouseById(@PathVariable int houseId){
        return ResponseEntity.ok(houseService.getHouseById(houseId));
    }

    @GetMapping
    public ResponseEntity<List<House>> getAllHouse(){
        return ResponseEntity.ok(houseService.getAllHouse());
    }

    @PostMapping
    public House createHouse(@RequestBody House newHouse){
        return houseService.createHouse(newHouse);
    }


}

// /home
