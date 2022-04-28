package com.crud.crudbook.repository;

import com.crud.crudbook.entity.Guitar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuitarRepository extends JpaRepository<Guitar, Long> {
}
