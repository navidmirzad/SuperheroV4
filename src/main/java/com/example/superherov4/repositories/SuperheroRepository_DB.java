package com.example.superherov4.repositories;

import com.example.superherov4.dto.SuperheroDTO;
import com.example.superherov4.model.Superhero;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SuperheroRepository_DB implements IRepository {
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

    public SuperheroDTO searchForSuperhero(String superheroName) {
        SuperheroDTO superheroByName = null;

        try (Connection con = DriverManager.getConnection(db_url, uid, pwd)) {

            String SQL = "select * from superhero where superheroName = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, superheroName);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int hero_id = rs.getInt("hero_id");
                String superheroNameColumn = rs.getString("superheroName");
                String realName = rs.getString("realName");
                int power_id = rs.getInt("power_id");
                int discoveryYear = rs.getInt("discoveryYear");
                String isHuman = rs.getString("isHuman");
                int strength = rs.getInt("strength");
                int city_id = rs.getInt("city_id");
                superheroByName = new SuperheroDTO (hero_id,superheroNameColumn, realName, power_id,
                        discoveryYear, isHuman, strength, city_id);

            } return superheroByName;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }




}



