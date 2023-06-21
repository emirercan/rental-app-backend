package com.ozbekemlak.Emlak.services;

import com.ozbekemlak.Emlak.entities.House;
import com.ozbekemlak.Emlak.repository.HouseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HouseService {

    private final HouseRepository houseRepository;

    public HouseService(HouseRepository houseRepository){
        this.houseRepository = houseRepository;
    }

    public List<House> getAllHouse(){
        return houseRepository.findAll();
    }

    public House getHouseById(int id){
        return houseRepository.findById(id).orElse(null);
    }

    public House createHouse(House house){
        House newHouse = new House();
        newHouse.setId(house.getId());
        newHouse.setTitle(house.getTitle());
        newHouse.setDescription(house.getDescription());
        newHouse.setPrice(house.getPrice());
        return houseRepository.save(newHouse);
    }
}
