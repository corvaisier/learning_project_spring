package main.java.dao.Gym;

import java.util.List;

import main.java.domain.Gym;

public interface GymDao {
    List<Gym> findAll();

    void add(Gym gym);
}
