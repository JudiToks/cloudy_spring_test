package com.example.cloudy_spring.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cloudy_spring.models.Couleur;
import com.example.cloudy_spring.repository.CouleurRepository;

@RestController
@RequestMapping("/couleur")
public class CouleurController {
    
    private final CouleurRepository CouleurRepository;

    @Autowired
    public CouleurController(CouleurRepository CouleurRepository) {
        this.CouleurRepository = CouleurRepository;
    }

    @GetMapping("findById/{id}")
    public Couleur findById(@PathVariable int id) {
        return CouleurRepository.findById(id);
    }

    @GetMapping("/all")
    public ArrayList<Couleur> findAll() {
        return (ArrayList<Couleur>)CouleurRepository.findAll();
    }

    @PostMapping("/save/{nom}")
    public Couleur save(@PathVariable String nom) {
        Couleur Couleur=new Couleur(nom);
        return CouleurRepository.save(Couleur);
    }

    @DeleteMapping("deleteById/{id}")
    public void deleteById(@PathVariable int id) {
        CouleurRepository.deleteById(id);
    }


}
