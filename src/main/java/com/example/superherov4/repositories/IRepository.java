package com.example.superherov4.repositories;

import com.example.superherov4.dto.SuperheroDTO;

public interface IRepository {

    SuperheroDTO searchForSuperhero(String superheroName);
}
