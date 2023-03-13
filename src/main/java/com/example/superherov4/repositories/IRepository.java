package com.example.superherov4.repositories;

import com.example.superherov4.dto.SuperheroCityDTO;
import com.example.superherov4.dto.SuperheroDTO;
import com.example.superherov4.dto.SuperheroPowerCountDTO;

import java.util.List;

public interface IRepository {

    SuperheroDTO searchForSuperhero(String superheroName);
    List<SuperheroPowerCountDTO> getSuperheroPowerCount();

    //SuperheroCityDTO getSuperheroCity(String city);
}
