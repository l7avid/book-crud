package com.crud.crudbook.controller;

import com.crud.crudbook.entity.Guitar;
import com.crud.crudbook.service.GuitarServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/guitars/v1/")
public class GuitarController {

    @Autowired
    private GuitarServiceInterface guitarServiceInterface;

    @GetMapping("get/guitars")
    public List<Guitar> getAllGuitars(){
        return guitarServiceInterface.getAllGuitars();
    }

    @PostMapping("save/guitar")
    public Guitar saveGuitar(@RequestBody Guitar guitar){
        return guitarServiceInterface.saveGuitar(guitar);
    }

    @PutMapping("update/guitar")
    public void updateGuitar(@RequestBody Guitar guitar){
        guitarServiceInterface.updateGuitar(guitar);
    }

    @DeleteMapping("delete/guitar/{id}")
    public void deleteGuitar(@PathVariable Long id){
        guitarServiceInterface.deleteGuitar(id);
    }

}
