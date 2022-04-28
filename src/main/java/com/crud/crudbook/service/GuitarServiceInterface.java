package com.crud.crudbook.service;

import com.crud.crudbook.entity.Guitar;

import java.util.List;

public interface GuitarServiceInterface {

    List<Guitar> getAllGuitars();

    Guitar saveGuitar(Guitar guitar);

    Guitar updateGuitar(Guitar guitar);

    void deleteGuitar(Long id);
}
