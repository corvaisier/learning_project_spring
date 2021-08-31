package main.java.dao.Coach;

import java.util.List;

import main.java.domain.Coach;

public interface CoachDao {
    List<Coach> findAll();
    Coach findById(Integer id);
    void add(Coach coach);
    void delete(String coach_Name);
}
