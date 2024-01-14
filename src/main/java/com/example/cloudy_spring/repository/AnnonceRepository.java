package com.example.cloudy_spring.repository;

import com.example.cloudy_spring.models.Annonce;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnnonceRepository extends CrudRepository<Annonce, Integer>
{
    List<Annonce> findByIdUser(int id_user);
    Annonce findById(int id_annonce);
}