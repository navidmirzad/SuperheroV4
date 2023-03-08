package com.example.superherov4.Service;

import com.example.superherov4.model.Superhero;
import com.example.superherov4.repositories.SuperheroRepository_DB;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class SuperheroService {

    private SuperheroRepository_DB superheroRepository_db;

    public SuperheroService(SuperheroRepository_DB superheroRepository_db) {
        this.superheroRepository_db = superheroRepository_db;
    }

    public List<Superhero> getSuperheroes() {
        return superheroRepository_db.getSuperheroes();
    }


  /*  public Superhero createSuperhero(Superhero superhero) {
        return superheroRepository.createSuperhero(superhero);
    }

    public Superhero searchForSuperhero(String superheroName) {
        return superheroRepository.searchForSuperhero(superheroName);
    }

    public Superhero editSuperhero(Superhero superhero) {
        return superheroRepository.editSuperhero(superhero);
    }

    public Superhero deleteSuperhero(Superhero superhero) {
        return superheroRepository.deleteSuperhero(superhero);
    }*/

}