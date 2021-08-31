package main.java.service;

import java.util.UUID;
import java.util.List;

import main.java.dao.Coach.CoachDao;
import main.java.domain.Coach;

public class CoachService {

    private CoachDao coachDao;
    
    public CoachService(CoachDao coachDao) {
        this.coachDao = coachDao;
    }

    public void add(String coach_Name) {
        Coach newcoach = new Coach(UUID.randomUUID(), coach_Name);
        coachDao.add(newcoach);
    }

    public void delete(String coach_Name) {

    }

    public List<Coach> findAll() {
        return coachDao.findAll();
    }

    public Coach findById(Integer id) {
        return coachDao.findById(id);
    }

}
