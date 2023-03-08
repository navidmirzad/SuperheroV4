package com.example.superherov4.repositories;

import com.example.superherov4.model.Superhero;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SuperheroRepository_DB {
    @Value("${spring.datasource.url}")
    private String db_url;

    @Value("${spring.datasource.username}")
    private String uid;

    @Value("${spring.datasource.password}")
    private String pwd;

    public List<Superhero> getSuperheroes() {
        List<Superhero> superheroes = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(db_url, uid, pwd)) {

            String SQL = "select * from superhero";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(SQL);

            while (rs.next()) {
                int hero_id = rs.getInt("hero_id");
                String superheroName = rs.getString("superheroName");
                String realName = rs.getString("realName");
                int discoveryYear = rs.getInt("discoveryYear");
                String isHuman = rs.getString("isHuman");
                int strength = rs.getInt("strength");
                superheroes.add(new Superhero(hero_id, superheroName, realName, discoveryYear, isHuman, strength));
            }
            return superheroes;

            } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }




}



