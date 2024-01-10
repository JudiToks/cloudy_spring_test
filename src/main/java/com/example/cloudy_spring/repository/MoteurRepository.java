package com.example.cloudy_spring.repository;

import com.example.cloudy_spring.models.Moteur;
import org.springframework.data.repository.CrudRepository;

public interface MoteurRepository extends CrudRepository<Moteur, Integer>
{
    Moteur findById(int id_moteur);
}
