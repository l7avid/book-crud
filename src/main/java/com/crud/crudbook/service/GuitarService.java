package com.crud.crudbook.service;

import com.crud.crudbook.entity.Guitar;
import com.crud.crudbook.repository.GuitarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class GuitarService implements GuitarServiceInterface{

    @Autowired
    private GuitarRepository guitarRepository;

    @Override
    public List<Guitar> getAllGuitars() {
        return guitarRepository.findAll();
    }

    @Override
    public Guitar saveGuitar(Guitar guitar) {
        return guitarRepository.save(guitar);
    }

    /*@Override
    public void updateGuitar(List<Guitar> guitars) {
        System.out.println(guitars.get(0));
        if(guitarRepository.exists(Example.of(guitars.get(0)))){
            System.out.println("Updating guitar");
            guitarRepository.save(guitars.get(1));
        }
        else {
            System.out.println("Not able to update. This guitar doesn't exist");
        }
    }*/

    @Override
    public Guitar updateGuitar(Guitar guitar) {
        return guitarRepository.save(guitar);
    }

    @Override
    public void deleteGuitar(Long id) {
        guitarRepository.deleteById(id);

    }
}
